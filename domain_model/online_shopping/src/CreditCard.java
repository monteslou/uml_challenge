import java.util.Date;

public class CreditCard extends PaymentMethod{

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
    public void authorize() {
        System.out.println("Inside CreditCard::authorize() method");
    }
}
