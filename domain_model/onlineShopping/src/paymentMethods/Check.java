package paymentMethods;

public class Check implements PaymentMethod {

    private int nuymber;
    private int bankId;

    @Override
    public void authorize() {
        System.out.println("Inside paymentMethods.Check::authorize() method");
    }
}
