/*
 *Java Syntax
 *
 *@autor Valentin Mozul
 *@version from 17.09.2021
 */

public enum Currency {

    USD("USD"),
    UAH("UAH"),
    EUR("EUR"),
    RUB("RUB");

    String value;

    Currency(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
