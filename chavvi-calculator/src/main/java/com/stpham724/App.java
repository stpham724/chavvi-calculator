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
    System.out.print("Enter a value for A: ");
    a = Float.parseFloat(scanner.nextLine().trim());
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
}