package main.java.org.example.model;
import java.util.HashMap;
import java.util.Map;

public class Cart {

    Map<String, Item> items = new HashMap<>();

    public Map<String, Item> getItems() {
        return items;
    }

}
