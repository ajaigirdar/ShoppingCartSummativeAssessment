package main.java.org.example.model;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class Cart {

    public Map<Item, Integer> items = new HashMap<>();

    public void addItem(Item item, int quantity){

    }

    public void removeItem(Item item, int quantity){

    }

    public Map<Item, Integer> getItems() {
        return items;
    }

    public void displayCart() {

    }

    public double calculateTotal() {
        return 0;
    }

    public void clearCart(){
        items.clear();
    }


}
