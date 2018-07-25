package paymentMethods;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DebitCard implements PaymentMethod {
    private double number;
    private Date expDate;
    private Issuer issuer;

    public DebitCard(double number, Date expDate, Issuer issuer) {
        this.number = number;
        this.expDate = expDate;
        this.issuer = issuer;
    }

    @Override
    public String toString() {
        SimpleDateFormat dt = new SimpleDateFormat("mm/YYYY");
        return "DebitCard~ " +
                "number card: " + ("**** **** **** " +   (int ) number% 10000) +
                ", exp date: " + dt.format(expDate) +
                ", issuer: " + issuer;
    }

    @Override
    public void authorize() {
        System.out.println("Inside DeditCard::authorize() method");
    }
}
