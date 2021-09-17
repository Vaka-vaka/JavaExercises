/*
 *Java Syntax
 *
 *@autor Valentin Mozul
 *@version from 17.09.2021
 */

import java.net.URI;
import java.text.*;
import java.util.*;

public class HelloURL {
    private static final String GET_URL = "https://bank.gov.ua/NBUStatService/v1/statdirectory/exchangenew?json?date=";
    private static final String GET_URLP = "https://api.privatbank.ua/p24api/exchange_rates?json&date=";

    public static void main(String[] args) {
        System.out.println("NBU = " + URI.create(GET_URL + new SimpleDateFormat
                ("dd.MM.yyyy").format(new Date())));
        System.out.println("PRIVATBANK = " + URI.create(GET_URLP + new SimpleDateFormat
                ("dd.MM.yyyy").format(new Date())));
    }
}
