package main.java.org.example.services;
import main.java.org.example.model.Cart;

public class CartService {

    private Cart cart;

    public CartService(Cart cart){
        this.cart = cart;
    }

    public void addItem(String itemName, double price, int quantity){
        cart.addItem(itemName, price, quantity);
    }

    public void removeItem(String itemName, int quantity) {
        cart.removeItem(itemName, quantity);
    }

    public void displayCart() {
        cart.displayCart();
    }

    public double calculateTotal() {
        return cart.calculateTotal();
    }

    public void checkout() {
        if (cart.getItems().isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            double total = calculateTotal();
            System.out.println("Total amount due: $" + total);
            cart.clearCart();
            System.out.println("Cart cleared. Goodbye!");
        }
    }
}
