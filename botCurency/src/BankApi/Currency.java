/**
 * botCurrency. Java.
 *
 * @autor Valentin Mozul
 * @version from 20.09.21
 */

package BankApi;

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
