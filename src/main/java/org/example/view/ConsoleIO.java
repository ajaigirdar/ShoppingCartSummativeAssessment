package main.java.org.example.view;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleIO {
    private Scanner scanner = new Scanner(System.in);

    public void displayMessage(String message){
        System.out.println(message);
    }

    public int getInt(String prompt){
        while (true){
            try {
                System.out.println(prompt);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
        }
    }

    public double getDoubleInput(String prompt){
        while (true){
            try{
                System.out.println(prompt);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
        }
    }

    public String getStringInput(String prompt){
        System.out.println(prompt);
        return scanner.next();
    }
}
