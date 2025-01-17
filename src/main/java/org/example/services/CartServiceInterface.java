package main.java.org.example.services;

public interface CartServiceInterface {
    void addItem(String itemName, double price, int quantity);

    void removeItem(String itemName, int quantity);

    void displayCart();

    double calculateTotal();

    void checkout();
}
