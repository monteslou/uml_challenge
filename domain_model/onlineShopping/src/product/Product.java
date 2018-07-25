package product;

public class Product {
    private String sku;
    private String name;
    private String description;

    public Product() {
        this.sku = "";
        this.name = "";
        this.description = "";
    }

    public Product(String sku, String name, String description) {
        this.sku = sku;
        this.name = name;
        this.description = description;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product~ " + '\n' +
                "sku: " + sku + '\n' +
                "name: " + name + '\n' +
                "description: " + description;
    }
}
