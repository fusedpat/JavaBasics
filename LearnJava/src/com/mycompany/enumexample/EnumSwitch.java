package com.mycompany.enumexample;

//Define an enum for different coffee sizes
enum CoffeeSize {
 SMALL, MEDIUM, LARGE
}

public class EnumSwitch {

 public static void main(String[] args) {
     // Choose a coffee size
     CoffeeSize coffee = CoffeeSize.LARGE;

     // Use a switch statement to handle different coffee sizes
     switch (coffee) {
         case SMALL:
             System.out.println("You ordered a small coffee.");
             break;
         case MEDIUM:
             System.out.println("You ordered a medium coffee.");
             break;
         case LARGE:
             System.out.println("You ordered a large coffee.");
             break;
         default:
             System.out.println("Invalid coffee size.");
             break;
     }
 }
}

