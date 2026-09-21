package com.stpham724;

public class App {
    public static void main(String[] args) {
        printMenu();
    }

    private static void printMenu() {
        System.out.println("----------------------------------------------------");
        System.out.println("Chavvi Calc");
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