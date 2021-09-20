/**
 * botCurrecy. Java.
 *
 * @autor Valentin Mozul
 * @version from 20.09.21
 */

package BankApi;

import java.util.*;

public class PrivatCurrency extends PrivatBankApi{

    String date;
    String bank;
    int baseCurrrency;
    String baseCurrencyLit;
    List<ExchangeRate> exchangeRate;

    static class ExchangeRate {

        String baseCurrency;
        String currency;
        float saleRateNB;
        float purchaseRateNB;
        float saleRate;
        float getPurchaseRate;

        public String getBaseCurrency() {
            return baseCurrency;
        }

        public String getCurrency() {
            return currency;
        }

        public float getSaleRateNB() {
            return saleRateNB;
        }

        public float getPurchaseRateNB() {
            return purchaseRateNB;
        }

        public float getSaleRate() {
            return saleRate;
        }

        public float getGetPurchaseRate() {
            return getPurchaseRate;
        }
    }

    public String getDate() {
        return date;
    }

    public String getBank() {
        return bank;
    }

    public int getBaseCurrrency() {
        return baseCurrrency;
    }

    public String getBaseCurrencyLit() {
        return baseCurrencyLit;
    }

    public List<ExchangeRate> getExchangeRate() {
        return exchangeRate;
    }

    @Override
    public String toString() {
        return "PrivatCurrency{" +
                "date='" + date + '\'' +
                ", bank='" + bank + '\'' +
                ", baseCurrrency=" + baseCurrrency +
                ", baseCurrencyLit='" + baseCurrencyLit + '\'' +
                ", exchangeRate=" + exchangeRate +
                '}';
    }
}
