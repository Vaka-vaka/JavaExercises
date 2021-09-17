/*
 *Java Syntax
 *
 *@autor Valentin Mozul
 *@version from 17.09.2021
 */

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.net.*;
import java.net.http.*;
import java.text.*;
import java.util.*;

public class HelloURL {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("NBU = " + URI.create(GET_URL + new SimpleDateFormat
                ("dd.MM.yyyy").format(new Date())));
        System.out.println("PRIVATBANK = " + URI.create(GET_URLP + new SimpleDateFormat
                ("dd.MM.yyyy").format(new Date())));
        System.out.println(getListOfCurrenciesRate());
    }

    private static final String GET_URL = "https://bank.gov.ua/NBUStatService/v1/statdirectory/exchangenew?json?date=";
    private static final URI uri = URI.create(GET_URL + new SimpleDateFormat
            ("dd.MM.yyyy").format(new Date()));

    private static final String GET_URLP = "https://api.privatbank.ua/p24api/exchange_rates?json&date=";

    public static List<NBUCurrency> getListOfCurrenciesRate() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        Gson gson = new Gson();

        final HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        List<NBUCurrency> currencies = gson.fromJson(response.body(), new TypeToken<List<NBUCurrency>>() {
        }.getType());

        List<NBUCurrency> result = new ArrayList<>();
        for (NBUCurrency currency : currencies) {
            for (Currency value : Currency.values()) {
                if (currency.getCc().equals(value.getValue())) {
                    result.add(currency);
                }
            }
        }
        return result;
    }
}

