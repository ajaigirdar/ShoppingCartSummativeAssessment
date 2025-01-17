package main.java.org.example.services;
import main.java.org.example.model.Cart;
import main.java.org.example.model.Item;

public class CartService {

    private Cart cart;

    public CartService(Cart cart){
        this.cart = cart;
    }

    public void addItem(String itemName, double price, int quantity){
        cart.addItem(itemName, price, quantity);
    }

    public void removeItem(Item item, int quantity) {
        cart.removeItem(item, quantity);
    }

    public void displayCart() {
        cart.displayCart();
    }

    public double calculateTotal() {
        return cart.calculateTotal();
    }

    public void checkout() {
        cart.clearCart();
    }

}
