/**
 * botCurrecy. Java.
 *
 * @autor Valentin Mozul
 * @version from 20.09.21
 */

package BankApi;

import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrivatBankApi {

    private static final String url =  "https://api.privatbank.ua/p24api/exchange_rates?json&date="; //Архив курсов валют ПриватБанка
    private static final URI uri = URI.create(url + new SimpleDateFormat("dd.MM.yyyy").format(new Date()));


}
