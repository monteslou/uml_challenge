import paymentMethods.CreditCard;
import paymentMethods.DebitCard;
import paymentMethods.Issuer;
import paymentMethods.PaymentMethod;
import product.*;
import user.Account;
import user.AccountStatus;
import user.Address;
import user.Customer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client {

    private Product product1, product2, product3, product4;
    private LineItem lineItem1, lineItem2, lineItem3, lineItem4, lineItem5, lineItem6, lineItem7, lineItem8;
    private Customer customer;
    private Account account;
    private ShoppingCart shoppingCart;
    private List<Address> addressList;
    private List<PaymentMethod> paymentMethodList;
    private PaymentMethod paymentMethod1, paymentMethod2;
    private Address address1, address2;
    private Order order;
    private List<LineItem> lineItemList;



    public static void main(String arg[]) throws ParseException {
        new Client();
    }

    private Client() throws ParseException {
        this.createProduct();
        this.createCustomer();
        this.createAccount();
        this.createPaymentMethod();
        this.createAddress();
        this.createShoppingCart1();
        this.clearShoppingCart();
        this.createShoppingCart2();
        this.createOrder();
        this.deleteAccount();
    }

    private void createProduct() {
        System.out.println("-----Creating Product-----");
        product1 = new Product("BRCbeads1",
                "Black Lava Gemstone",
                "-Material: 8mm Black Lava Stone; Well Polished Rough Surface Beads with Free gift, Approxi 15.5 inch 45pcs 1 Strand per Bag\n" +
                        "-The BRCbeads Advantage: Join the 1 million+ customers powered by our beading and fashion jewelry style, Share our 20 plus years experience in the Jewelry business\n" +
                        "-Note: All stones are unique and may vary from the one shown in the picture.\n" +
                        "-Trade Mark Protection: BRCbeads is a registered brand with the US Patent and Trademark Office. Our logo, brand, and slogan are all intellectual property of BRC Creative Corp. MAKE SURE to only buy from BRC Creative Corp., the manufacturer. Other sellers with a New listing are not authorized by BRC Creative Corp. to sell this product. They are known to offer counterfeit,imitative beads, not authentic BRCbeads.\n" +
                        "-What You Get: FREE GIFT with each order- special goodies for your jewelry needs. Our 60-day satisfaction guarantee and friendly customer service, No questions will be asked if you are not completely satisfied with the product and want to return it. ( Please only choose our authentic seller BRC Creative Corp.)\n");

        product2 = new Product("BRCbeads2",
                "Onyx Gemstone", "Material: 8mm Black Onyx; Heat Treating; Enhance Color Beads with Free gift, Approxi 15.5 inch 45pcs 1 Strand per Bag\n" +
                "-The BRCbeads Advantage: Join the 1 million+ customers powered by our beading and fashion jewelry style, Share our 20 plus years experience in the Jewelry business\n" +
                "-Note: All stones are unique and may vary from the one shown in the picture.\n" +
                "-Trade Mark Protection: BRCbeads is a registered brand with the US Patent and Trademark Office. Our logo, brand, and slogan are all intellectual property of BRC Creative Corp. MAKE SURE to only buy from BRC Creative Corp., the manufacturer. Other sellers with a New listing are not authorized by BRC Creative Corp. to sell this product. They are known to offer counterfeit,imitative beads, not authentic BRCbeads.\n" +
                "-What You Get: FREE GIFT with each order- special goodies for your jewelry needs. Our 60-day satisfaction guarantee and friendly customer service, No questions will be asked if you are not completely satisfied with the product and want to return it. ( Please only choose our authentic seller BRC Creative Corp.) \n");

        product3 = new Product("BRCbeads3",
                "Rose Quartz Gemstone",
                "Material: 8mm Rose Quartz; Heat Treat:ing; Enhance Color Genuine Natural Semi-Precious Gemstones Beads with Free gift, Approxi 15.5 inch 45pcs 1 Strand per Bag\n" +
                        "-The BRCbeads Advantage: Join the 1 million+ customers powered by our beading and fashion jewelry style, Share our 20 plus years experience in the Jewelry business\n" +
                        "-Note: All stones are unique and may vary from the one shown in the picture.\n" +
                        "-Trade Mark Protection: BRCbeads is a registered brand with the US Patent and Trademark Office. Our logo, brand, and slogan are all intellectual property of BRC Creative Corp. MAKE SURE to only buy from BRC Creative Corp., the manufacturer. Other sellers with a New listing are not authorized by BRC Creative Corp. to sell this product. They are known to offer counterfeit,imitative beads, not authentic BRCbeads.\n" +
                        "-What You Get: FREE GIFT with each order- special goodies for your jewelry needs. Our 60-day satisfaction guarantee and friendly customer service, No questions will be asked if you are not completely satisfied with the product and want to return it. ( Please only choose our authentic seller BRC Creative Corp.) \n");

        product4 = new Product("BRCbead4",
                "Flourite Gemston",
                "Material: 8mm Flourite Genuine Natural Semi-Precious Gemstones Beads with Free gift, Approxi 15.5 inch 45pcs 1 Strand per Bag\n" +
                        "-The BRCbeads Advantage: Join the 1 million+ customers powered by our beading and fashion jewelry style, Share our 20 plus years experience in the Jewelry business\n" +
                        "-Note: All stones are unique and may vary from the one shown in the picture.\n" +
                        "-Trade Mark Protection: BRCbeads is a registered brand with the US Patent and Trademark Office. Our logo, brand, and slogan are all intellectual property of BRC Creative Corp. MAKE SURE to only buy from BRC Creative Corp., the manufacturer. Other sellers with a New listing are not authorized by BRC Creative Corp. to sell this product. They are known to offer counterfeit,imitative beads, not authentic BRCbeads.\n" +
                        "-What You Get: FREE GIFT with each order- special goodies for your jewelry needs. Our 60-day satisfaction guarantee and friendly customer service, No questions will be asked if you are not completely satisfied with the product and want to return it. ( Please only choose our authentic seller BRC Creative Corp.) \n");

        System.out.println(product1.toString() + " \n" +  product2.toString() + "\n" + product3.toString() + "\n" + product4.toString());

        System.out.println("-----Assign quantity and price to product-----");

        lineItem1 = new LineItem(product1, 80, 5.69);
        lineItem2 = new LineItem(product2, 50, 7.49);
        lineItem3 = new LineItem(product3, 60, 7.99);
        lineItem4 = new LineItem(product4, 75, 11.99);

        lineItem5 = new LineItem(product1, 120, 5.69);
        lineItem6 = new LineItem(product2, 145, 7.49);
        lineItem7 = new LineItem(product3, 150, 7.99);
        lineItem8 = new LineItem(product4, 130, 11.99);

        System.out.println(lineItem1.toString() + "\n" + lineItem2.toString() + "\n" + lineItem3.toString() + "\n" + lineItem4.toString() + "\n");
        System.out.println(lineItem5.toString() + "\n" + lineItem6.toString() + "\n" + lineItem7.toString() + "\n" + lineItem8.toString() + "\n");
    }

    private void createCustomer() {
        System.out.println("-----Creating Customer-----");
        customer = new Customer(1, "Julian Andres", 456, "julianAndres", "julian123");
        System.out.println(customer.toString() + "\n");

    }

    private void createAccount() {
        System.out.println("-----Creating Account-----");
        account = new Account(1, customer, AccountStatus.ACTIVE, shoppingCart, addressList, paymentMethodList);
        System.out.println(account.toString() + "\n");
    }

    private void createPaymentMethod() throws ParseException {
        System.out.println("-----Creating Payment Methods-----");
        SimpleDateFormat dt = new SimpleDateFormat("mm/YYYY");
        paymentMethod1 = new CreditCard(34567898, dt.parse("04/2022"), 11, Issuer.AMEX);
        paymentMethod2 = new DebitCard(45781231, dt.parse("12/2021"), Issuer.MASTERCARD);
        System.out.println(paymentMethod1.toString() + "\n" + paymentMethod2.toString() + "\n" );

        paymentMethodList = new ArrayList<>();
        paymentMethodList.add(paymentMethod1);
        paymentMethodList.add(paymentMethod2);
        account.setMethods(paymentMethodList);
        System.out.println("-----Adding Payment Methods to Account----- \n");
        System.out.println(account.toString() + "\n");

    }

    private void createAddress(){
        System.out.println("-----Creating Address-----");
        address1 = new Address(1, "Cra. 11 #96-38", "Building box", "Bogota", "Colombia", false);
        address2 = new Address(1, "7290 NW 66th ST", "ABE 110229", "Miami, Florida", "United State", true);
        System.out.println(address1.getAddress() + "\n" + address2.getAddress() + "\n");

        addressList = new ArrayList<>();
        addressList.add(address1);
        addressList.add(address2);
        account.setAddresses(addressList);
        System.out.println("-----Adding Addresses to Account----- \n");
        System.out.println(account.toString() + "\n");
    }

    private void createShoppingCart1() {
        System.out.println("-----Creating Shopping Cart 1 -----");
        shoppingCart = new ShoppingCart();

        shoppingCart.addItem(lineItem1);
        shoppingCart.addItem(lineItem2);
        shoppingCart.addItem(lineItem3);
        shoppingCart.addItem(lineItem4);
        System.out.println(shoppingCart.toString()+ "\n" );

    }

    private void clearShoppingCart(){

        System.out.println("-----Deleted Shopping Cart----- \n");
        shoppingCart.cleanCart();
        System.out.println("-----Showing items of deleted Shopping Cart----- \n");
        System.out.println(lineItem1.toString() + "\n" + lineItem2.toString() + "\n"  + lineItem3.toString()+ "\n"  + lineItem4.toString() + "\n");
    }

    private void createShoppingCart2() {
        System.out.println("-----Creating Shopping Cart 2 -----");
        shoppingCart = new ShoppingCart();

        shoppingCart.addItem(lineItem5);
        shoppingCart.addItem(lineItem6);
        shoppingCart.addItem(lineItem7);
        shoppingCart.addItem(lineItem8);
        System.out.println(shoppingCart.toString() + "\n" );
        account.setCart(shoppingCart);

    }

    private void createOrder(){
        System.out.println("-----Creating Order-----");
        SimpleDateFormat dt = new SimpleDateFormat("dd/mm/YYYY");
        Date now = new Date();
        lineItemList = new ArrayList<>();
        order = new Order(1, now, OrderStatus.DELIVERED, address2.getAddress(), 0, lineItemList);
        System.out.println(order.toString());
        order.addItem(lineItem5);
        order.addItem(lineItem6);
        order.addItem(lineItem7);
        order.addItem(lineItem8);
        order.setTotal(order.setTotal());
        System.out.println(order.toString() + "\n");

    }
    private void deleteAccount(){
        System.out.println("-----Deleting account-----");

        account.destroyMethods();
        paymentMethod1 = null;
        paymentMethod2 = null;
        System.out.println(account.toString() + "\n");

        account.destroyAddresses();
        address1 = null;
        address2 = null;
        System.out.println(account.toString() + "\n");

        account = null;

        System.out.println("-----Account DELETED-----");
    }


}
