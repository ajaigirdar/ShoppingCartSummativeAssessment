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
            consoleIO.displayMessage("Welcome To Shopping Cart App \uD83D\uDECD\uFE0F");
            consoleIO.displayMessage("Main Menu:");
            consoleIO.displayMessage("1. Display Cart");
            consoleIO.displayMessage("2. Remove an Item");
            consoleIO.displayMessage("3. Add an Item");
            consoleIO.displayMessage("4. Checkout");
            consoleIO.displayMessage("5. Exit");

            int choice = consoleIO.getInt("Choose an option: ");

            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    consoleIO.displayMessage("Exiting the app. Goodbye! ");
                    keepRunning = false;
                    break;
                default:
                    consoleIO.displayMessage("Invalid input. Please try again");
            }
        }
    }

    private void handleRemoveItem(){

    }

    private void handleAddItem() {

    }
}
