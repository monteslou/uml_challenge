package product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<LineItem> items;

    public ShoppingCart() { items = new ArrayList<>(); }

    @Override
    public String toString() {
        String cart = "ShoppingCart~ \n";
        for (int i = 0; i < items.size(); i++){
            cart = cart + "- item "+ (i+1) + ": \n " + items.get(i).toString() + "\n" ;
        }
        return cart;
    }

    public void addItem(LineItem i){
        items.add(i);
    }
    public void cleanCart(){
        this.items.clear();
    }
}
