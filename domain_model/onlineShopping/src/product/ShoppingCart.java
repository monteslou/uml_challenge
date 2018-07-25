package product;

import java.util.List;

public class ShoppingCart {

    private List<LineItem> items;

    public ShoppingCart(List<LineItem> items) {
        this.items = items;
    }

    public void addItem(LineItem i){
        items.add(i);
    }
    public void cleanCart(){
        this.items.clear();
    }
}
