package com.stpham724;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        float a = 0.0f;
        float b = 0.0f;

        while (running) {
            printMenu(a, b);
            String command = scanner.nextLine().trim();

            if (command.equals("q")) {
                running = false;
            } else if (command.equals("a")) {
                a = getNumber(scanner, "A", a);
            } else if (command.equals("b")) {
                b = getNumber(scanner, "B", b);
            } else if (command.equals("+")) {
                a = a + b;
            } else if (command.equals("-")) {
                a = a - b;
            } else if (command.equals("*")) {
                a = a * b;
            } else if (command.equals("/")) {
                if (b != 0.0f) {
                    a = a / b;
                } else {
                    System.out.println("You can't divide by zero.");
                }
            } else if (command.equals("c")) {
                a = 0.0f;
                b = 0.0f;
            } else {
                System.out.println("That command doesn't work. Try again.");
            }

        }

        scanner.close();

    }

    private static void printMenu(float a, float b) {
        System.out.println("----------------------------------------------------");
        System.out.println("Chavvi Calc");
        System.out.println("----------------------------------------------------");
        System.out.printf("A = %.3f        B = %.3f%n", a, b);
        System.out.println("----------------------------------------------------");
        System.out.println("a       Enter a value for A");
        System.out.println("b       Enter a value for B");
        System.out.println("+       Add");
        System.out.println("-       Subtract");
        System.out.println("*       Multiply");
        System.out.println("/       Divide");
        System.out.println("c       Clear");
        System.out.println("q       Quit");
        System.out.println("----------------------------------------------------");
        System.out.print("Enter a command: ");
    }

    private static float getNumber(Scanner scanner, String name, float currentValue) {
        System.out.print("Enter a value for " + name + ": ");

        try {
            return Float.parseFloat(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("That doesn't look like a number. Try again.");
            return currentValue;
        }
    }
}