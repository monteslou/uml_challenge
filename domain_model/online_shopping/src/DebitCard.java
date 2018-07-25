import java.util.Date;

public class DebitCard extends PaymentMethod{
    private double number;
    private Date expDate;
    private Issuer issuer;

    public DebitCard(double number, Date expDate, Issuer issuer) {
        this.number = number;
        this.expDate = expDate;
        this.issuer = issuer;
    }

    @Override
    public void authorize() {
        System.out.println("Inside DeditCard::authorize() method");
    }
}
