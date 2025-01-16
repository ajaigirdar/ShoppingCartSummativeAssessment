package main.java.org.example.controller;
import main.java.org.example.services.CartService;
import main.java.org.example.view.ConsoleIO;

public class MainMenuController {
    CartService cartService;
    ConsoleIO consoleIO;

    public MainMenuController(CartService cartService, ConsoleIO consoleIO) {
        this.cartService = cartService;
        this.consoleIO = consoleIO;
    }

    public void displayMenu(){


        boolean keepRunning = true;

        while (keepRunning) {
            consoleIO.displayMessage("Shopping Cart App \uD83D\uDECD\uFE0F");
        }
    }

    private void handleRemoveItem(){

    }

    private void handleAddItem() {

    }
}
