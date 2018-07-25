package user;

import java.util.Collections;

public class Customer {
    private int id;
    private String name;
    private int contact;
    private String userName;
    private String password;

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
        int lengthPassword = this.password.length();
        String str = "*";

        return  "Customer~ " + "id: " + id +
                ", Name: " + name +
                ", Contact: " + contact +
                ", User name: " + userName +
                ", Password: " + String.join("", Collections.nCopies(lengthPassword, str));
    }
}

