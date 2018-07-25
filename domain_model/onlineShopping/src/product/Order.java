package product;

import java.util.Date;
import java.util.List;

public class Order {

    private int id;
    private Date modified;
    private OrderStatus status;
    private String shippingAddress;
    private double total;
    private List<LineItem> items;

    public Order(int id, Date modified, OrderStatus status, String shippingAddress, double total, List<LineItem> items) {
        this.id = id;
        this.modified = modified;
        this.status = status;
        this.shippingAddress = shippingAddress;
        this.total = total;
        this.items = items;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<LineItem> getItems() {
        return items;
    }

    public void setItems(List<LineItem> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        if (items == null) {
            return "Product Order ~ " +
                    "id: " + id +
                    ", modified: " + modified +
                    ", status: " + status +
                    ", shippingAddress: '" + shippingAddress + '\'' +
                    ", total: $" + total + " US"+
                    ", items: Empty";
        } else {
            return "Product Order ~ \n" +
                    "id: " + id +
                    ", modified: " + modified + "\n" +
                    "status: " + status +
                    ", shipping address: " + shippingAddress + "\n" +
                    "Total: $" + total + " US" + "\n" +
                    "items: " + items.toString();
        }
    }

    public void addItem(LineItem i) {
        items.add(i);
    }

    public double setTotal() {
        double total = 0;
        for (int i = 0; i < items.size(); i++) {
            total = total + (items.get(i).getPrice() * items.get(i).getQuantity());
        }
        return total;
    }
}
