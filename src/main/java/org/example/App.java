package main.java.org.example;
import main.java.org.example.controller.MainMenuController;
import main.java.org.example.model.Cart;
import main.java.org.example.services.CartService;
import main.java.org.example.view.ConsoleIO;

public class App {
    public static void main(String[] args) {
        ConsoleIO consoleIO = new ConsoleIO();
        Cart cart = new Cart();
        CartService cartService = new CartService(cart);
        MainMenuController menuController = new MainMenuController(cartService, consoleIO);

        menuController.displayMenu();

    }
}