package main.java.org.example.view;

import java.util.Scanner;

public class ConsoleIO {
    private Scanner scanner = new Scanner(System.in);

    public void printMessage(String message){
        System.out.println(message);
    }

    public int getInt(String prompt){
        System.out.println(prompt);
        return scanner.nextInt();
    }

    public double getDoubleInput(String prompt){
        System.out.println(prompt);
        return scanner.nextDouble();
    }

    public String getStringInput(String prompt){
        System.out.println(prompt);
        return scanner.next();
    }
}
