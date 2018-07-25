package paymentMethods;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CreditCard implements PaymentMethod {

    private double number;
    private Date expDate;
    private int maxInstallements;
    private Issuer issuer;

    public CreditCard(double number, Date expDate, int maxInstallements, Issuer issuer) {
        this.number = number;
        this.expDate = expDate;
        this.maxInstallements = maxInstallements;
        this.issuer = issuer;
    }

    @Override
    public String toString() {
        SimpleDateFormat dt = new SimpleDateFormat("mm/YYYY");
        return "CreditCard~ " +
                "number: " + ("**** **** **** " +  (int )(number% 10000)) +
                ", exp date: " + dt.format(expDate) +
                ", issuer: " + issuer;
    }

    @Override
    public void authorize() {
        System.out.println("Inside paymentMethods.CreditCard::authorize() method");
    }
}
