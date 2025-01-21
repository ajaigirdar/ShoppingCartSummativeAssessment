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

    public void displayMenu() {
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
                    consoleIO.displayMessage("Exiting app. Goodbye!");
                    keepRunning = false;
                }
                case 5 -> {
                    consoleIO.displayMessage("Exiting app. Goodbye!");
                    keepRunning = false;
                }
                default -> consoleIO.displayMessage("Invalid input. Please try again. ");
            }
        }
    }

    public void displayMainMenu() {
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

    public void handleAddItem() {
        boolean addMoreItems = true;
        while (addMoreItems) {
            String name = consoleIO.getStringInput("Enter Item Name: ");
            double price = consoleIO.getDouble("Enter Item Price: ");
            int quantity = consoleIO.getInt("Enter Item Quantity: ");
            cartService.addItem(name.toUpperCase(), price, quantity);
            String choice;
            while (true) {
                choice = consoleIO.getStringInput("Do you want to add more items? (y/n): ");
                if (choice.equalsIgnoreCase("y")) {
                    break;
                } else if (choice.equalsIgnoreCase("n")) {
                    addMoreItems = false;
                    break;
                } else {
                    consoleIO.displayMessage("Invalid entry");
                }
            }
        }
    }

    public void handleRemoveItem() {
        boolean removeMoreItems = true;
        cartService.displayCart();
        while (removeMoreItems) {
            String name = consoleIO.getStringInput("Enter Item Name: ");
            int quantity = consoleIO.getInt("Enter Item Quantity: ");
            cartService.removeItem(name.toUpperCase(), quantity);
            String choice;

            while (true) {
                choice = consoleIO.getStringInput("Do you want to remove more items from cart? (y/n): ");
                if (choice.equalsIgnoreCase("y")) {
                    break;
                } else if (choice.equalsIgnoreCase("n")) {
                    removeMoreItems = false;
                    break;
                } else {
                    consoleIO.displayMessage("Invalid entry.");
                }
            }
        }
    }
}
