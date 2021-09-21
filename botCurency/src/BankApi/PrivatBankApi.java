/**
 * botCurrency. Java.
 *
 * @autor Valentin Mozul
 * @version from 20.09.21
 */

package BankApi;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.SimpleDateFormat;
import java.util.*;

public class PrivatBankApi {

    private static final String url =  "https://api.privatbank.ua/p24api/exchange_rates?json&date="; //Архив курсов валют ПриватБанка
    private static final URI uri = URI.create(url + new SimpleDateFormat("dd.MM.yyyy").format(new Date()));

    public static List<PrivatCurrency> getListOfCurrenciesRate() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        Gson gson = new Gson();

        final HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        List<PrivatCurrency> currencies = gson.fromJson(response.body(), new TypeToken<List<PrivatCurrency>>() {
        }.getType());

        List<PrivatCurrency> result = new ArrayList<>();
        for (PrivatBankApi currency : currencies) {
            for (Currency value : Currency.values()) {
                if (currency.getCc().equals(value.getValue())) {
                    result.add(currency);
                }
            }
        }
        return result;
    }
}
