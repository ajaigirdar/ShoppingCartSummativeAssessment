package main.java.org.example.view;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleIO {
    private final Scanner scanner = new Scanner(System.in);

    public void displayMessage(String message){
        System.out.println(message);
    }

    public String getStringInput(String prompt){
        while (true){
            try {
                System.out.println(prompt);
                return scanner.next();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Try again: ");
                scanner.next();
            }
        }
    }

    public int getInt(String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                return scanner.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Invalid input. Please enter a valid number: ");
                scanner.next();
            }
        }
    }

    public double getDouble(String prompt){
        while (true){
            try {
                System.out.println(prompt);
                return scanner.nextDouble();
            }catch (IllegalAccessError e) {
                System.out.println("Invalid input. Please enter a valid number: ");
                scanner.next();
            }
        }
    }
}
