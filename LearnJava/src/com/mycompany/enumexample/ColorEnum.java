package com.mycompany.enumexample;

import java.util.Scanner;

enum Color {
    RED("FF0000"),
    GREEN("00FF00"),
    BLUE("0000FF");

    private String hexValue;

    Color(String hexValue) {
        this.hexValue = hexValue;
    }

    public String getHexValue() {
        return hexValue;
    }
}
public class ColorEnum {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a color (RED, GREEN, or BLUE):");
    String userInput = scanner.nextLine().toUpperCase();

    try {
    	Color color = Color.valueOf(userInput); // Convert user input to enum constant
        System.out.println(userInput + " Hex Value: " + color.getHexValue());
    } catch (IllegalArgumentException e) {
        System.out.println("Invalid color input.");
    }
    
    scanner.close();
}  
}