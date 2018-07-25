public class Check extends PaymentMethod{

    private int nuymber;
    private int bankId;


    @Override
    public void authorize() {
        System.out.println("Inside Check::authorize() method");
    }
}
