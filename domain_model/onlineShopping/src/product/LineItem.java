package product;

public class LineItem {
    private Product product;
    private int quantity;
    private double price;

    public LineItem(Product product, int quantity, double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "LineItem~ " +
                "sku: " + product.getSku() +
                ", product: " + product.getName() +
                ", quantity: " + quantity +
                ", price: $" + price +" US";
    }
}