package paymentMethods;

public class Check implements PaymentMethod {

    private int number;
    private int bankId;

    @Override
    public String toString() {
        return "Check~ " +
                "number: " + ("**** **** **** " +   (int ) number% 10000) +
                ", bankId: " + bankId;
    }

    @Override
    public void authorize() {
        System.out.println("Inside paymentMethods.Check::authorize() method");
    }
}
