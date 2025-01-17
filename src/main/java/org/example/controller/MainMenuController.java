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
            displayMainMenu();
            int choice = consoleIO.getInt("Choose an option: ");
            
            switch (choice) {
                case 1 -> cartService.displayCart();
                case 2 -> handleRemoveItem();
                case 3 -> handleAddItem();
                case 4 -> {
                    cartService.checkout();
                    consoleIO.displayMessage("Exiting the app. Goodbye! ");
                    keepRunning = false;
                }
                case 5 -> {
                    consoleIO.displayMessage("Exiting the app. Goodbye! ");
                    keepRunning = false;
                }
                default -> consoleIO.displayMessage("Invalid input. Please try again");
            }
        }
    }

    private void handleRemoveItem(){

    }

    private void handleAddItem() {

    }

    private void displayMainMenu() {
        consoleIO.displayMessage("-------------------------------");
        consoleIO.displayMessage("Welcome To Shopping Cart App \uD83D\uDECD️");
        consoleIO.displayMessage("-------------------------------");
        consoleIO.displayMessage("Main Menu:");
        consoleIO.displayMessage("1. Display Cart");
        consoleIO.displayMessage("2. Remove an Item");
        consoleIO.displayMessage("3. Add an Item");
        consoleIO.displayMessage("4. Checkout");
        consoleIO.displayMessage("5. Exit");
    }
}
