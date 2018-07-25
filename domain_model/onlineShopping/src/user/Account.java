package user;

import paymentMethods.PaymentMethod;
import product.ShoppingCart;

import java.util.List;

public class Account {

    private int id;
    private Customer customer;
    private AccountStatus status;
    private ShoppingCart cart;
    private List<Address> addresses;
    private List<PaymentMethod> methods;

    public Account(int id, Customer customer, AccountStatus status, ShoppingCart cart, List<Address> addresses, List<PaymentMethod> methods) {
        this.id = id;
        this.customer = customer;
        this.status = status;
        this.cart = cart;
        this.addresses = addresses;
        this.methods = methods;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<PaymentMethod> getMethods() {
        return methods;
    }

    public void setMethods(List<PaymentMethod> methods) {
        this.methods = methods;
    }

    @Override
    public String toString() {

        String account = "";
        String address = "Addresses: \n";
        String method = "Methods: \n";

        if (addresses != null) {
            for (int i = 0; i < addresses.size(); i++) {
                address = address + addresses.get(i).getAddress() + "\n";
            }
        }
        if (methods != null) {
            for (int i = 0; i < methods.size(); i++) {
                method = method + methods.get(i).toString() + "\n";
            }
        }

        if (cart != null && addresses != null && methods != null) {

            account = "Account~ id: " + id + ", customer: " + customer.getUserName() + ", status: " + status +
                    "\n" + "\n" + cart + "\naddresses: " + address + "\nmethods: " + method;
        } else {

            if (addresses != null && methods != null) {
                account = "Account~ id: " + id + ", customer: " + customer.getUserName() + ", status: " + status +
                        ", cart: Empty" + "\naddresses: " + address + "\nmethods: " + method;
            } else {
                if (cart != null && methods != null) {
                    account = "Account~ id: " + id + ", customer: " + customer.getUserName() + ", status: " + status +
                            "\n" + "\n" + "\naddresses: Empty" + ", methods: " + method;
                } else {
                    if (cart != null && addresses != null) {
                        account = "Account~ id: " + id + ", customer: " + customer.getUserName() + ", status: " + status +
                                "\n" + "\n" + cart + "\naddresses: " + address + "\nmethods: Empty";
                    } else {
                        if (addresses != null) {
                            account = "Account~ id: " + id + ", customer: " + customer.getUserName() + ", status: " + status +
                                    ", cart: Empty" + "\naddresses: " + address + "\nmethods: Empty";
                        } else {
                            if (methods != null) {
                                account = "Account~ id: " + id + ", customer: " + customer.getUserName() + ", status: " + status +
                                        ", cart: Empty" + "\naddresses: Empty" + "\nmethods: " + method;
                            } else {
                                if (cart != null) {
                                    account = "Account~ id: " + id + ", customer: " + customer.getUserName() + ", status: " + status +
                                            "\n" + "\n"  + cart + "\naddresses: Empty" + address + "\nmethods: Empty";
                                } else {
                                    account = "Account~ id: " + id + ", customer: " + customer.getUserName() + ", status: " + status +
                                            ", cart: Empty" + "\naddresses: Empty" + "\nmethods: Empty";
                                }
                            }
                        }

                    }
                }
            }
        }

        return account;

    }


    public void addMethod(PaymentMethod p) {
        this.methods.add(p);
    }

    public void addAddress(Address a) {
        this.addresses.add(a);
    }

    public void destroyMethods() {
        methods.removeAll(methods);
    }

    public void destroyAddresses() {
        addresses.clear();
    }


}
