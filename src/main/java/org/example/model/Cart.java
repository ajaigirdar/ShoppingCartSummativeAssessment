package main.java.org.example.model;
import java.util.HashMap;
import java.util.Map;

public class Cart {

    public Map<String, Item> items;

    public Cart() {
        this.items = new HashMap<>();
    }

    public void addItem(String itemName, double price, int quantity){
        Item item = items.get(itemName);
        if (item == null){
            item = new Item(itemName, price, quantity);
            items.put(itemName, item);
        } else {
            item.setQuantity(item.getQuantity() + quantity);
        }
    }

    public void removeItem(String itemName, int quantity){
        Item item = items.get(itemName);
        if (item != null) {
            int remainingQuantity = item.getQuantity() - quantity;
            if (remainingQuantity <= 0) {
                items.remove(itemName);
            } else {
                item.setQuantity(remainingQuantity);
            }
        }
    }

    public Map<String, Item> getItems() {
        return items;
    }

    public void displayCart() {
        if (items.isEmpty()) {
            System.out.println("Your Cart is Empty. Please Add Items.");
        } else {
            System.out.println("Your Cart:");
            System.out.println("-------------------------------");
            for (Map.Entry<String, Item> entry : items.entrySet()) {
                Item item = entry.getValue();
                System.out.println(item.getName() + "(" + item.getQuantity() + ") @ $" + item.getPrice());
            }
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Item item : items.values()) {
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }

    public void clearCart(){
        items.clear();
    }
}
