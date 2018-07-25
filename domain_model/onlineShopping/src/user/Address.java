package user;

public class Address {
    private int id;
    private String lineOne;
    private String lineTwo;
    private String city;
    private String country;
    private boolean billingAddress;

    public Address(int id, String lineOne, String lineTwo, String city, String country, boolean billingAddress) {
        this.id = id;
        this.lineOne = lineOne;
        this.lineTwo = lineTwo;
        this.city = city;
        this.country = country;
        this.billingAddress = billingAddress;
    }

    public String getAddress() {
        return (lineOne + " " + lineTwo + " " + city + " (" + country + ") ");
    }
}
