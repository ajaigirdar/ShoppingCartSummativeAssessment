package main.java.org.example.services;
import main.java.org.example.model.Cart;
import main.java.org.example.model.Item;

public class CartService implements CartServiceInterface{

    private final Cart cart;

    public CartService(Cart cart) {
        this.cart = cart;
    }

    public void addItem(String name, double price, int quantity){
        if (cart.getItems().containsKey(name)) {
            Item existingItem = cart.getItems().get(name);
            existingItem.setQuantity(existingItem.getQuantity() + quantity);
        } else {
            cart.getItems().put(name.toUpperCase(), new Item(name, price, quantity));
        }
        System.out.println(name + " added to your cart successfully.");
    }

    public void removeItem(String name, int quantity){
        if (cart.getItems().containsKey(name.toUpperCase())) {
            Item existingItem = cart.getItems().get(name);
            if (existingItem.getQuantity() > quantity) {
                existingItem.setQuantity(existingItem.getQuantity() - quantity);
                System.out.println(quantity + " " + name + "(s) removed from your cart.");
            } else {
                cart.getItems().remove(name);
                System.out.println(name + " removed from your cart.");
            }
        } else {
            System.out.println("Item not found in your cart.");
        }
    }

    public void displayCart(){
        if (cart.getItems().isEmpty()) {
            System.out.println("Your cart is empty. Add items to your cart.");
        } else {
            System.out.println("Items in your cart:");
            cart.getItems().values().forEach(item ->
                    System.out.println(item.getName() + "(" + item.getQuantity() + ")" + " @ $" + item.getPrice()));
        }
    }

    public double calculateTotal(){
        return cart.getItems().values().stream().mapToDouble(item -> item.getPrice() * item.getQuantity()).sum();
    }

    public void checkout(){
        if (cart.getItems().isEmpty()) {
            System.out.println("Your cart is empty");
        } else {
            double total = calculateTotal();
            System.out.println("Total amount due: $" + total);
            cart.getItems().clear();
            System.out.println("Cart cleared.");
        }
    }
}
