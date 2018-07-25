package user;

public class Customer {
    private int id;
    private String name;
    private int contact;
    private String userName;
    private String password;

    public Customer() {
        this.id = 0;
        this.name = "";
        this.contact = 0;
        this.userName = "";
        this.password = "";
    }

    public Customer(int id, String name, int contact, String userName, String password) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.userName = userName;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "user.Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contact=" + contact +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
