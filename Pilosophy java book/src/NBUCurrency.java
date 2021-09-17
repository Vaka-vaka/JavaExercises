/*
 *Java Syntax
 *
 *@autor Valentin Mozul
 *@version from 17.09.2021
 */

public class NBUCurrency extends HelloURL {
    int r030;
    String txt;
    float rate;
    String cc;
    String exchangedate;

    public int getR030() {
        return r030;
    }

    public String getTxt() {
        return txt;
    }

    public float getRate() {
        return rate;
    }

    public String getCc() {
        return cc;
    }

    public String getExchangedate() {
        return exchangedate;
    }

    @Override
    public String toString() {
        return "NBUCurrency{" +
                "r030=" + r030 +
                ", txt='" + txt + '\'' +
                ", rate=" + rate +
                ", cc='" + cc + '\'' +
                ", exchangedate='" + exchangedate + '\'' +
                '}';
    }
}
