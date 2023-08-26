package com.mycompany.enumexample;
import java.util.Scanner;
/**
 * Enums are set of applicable values
 * 
 * @author user
 *
 */
public class Enum {

	public static void main(String[] args) {
//		Directions d = Directions.EAST;
//		System.out.println("Direction = " + d);

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a direction (EAST, WEST, NORTH, SOUTH): ");
		String userInput = scanner.nextLine().toUpperCase();

		try {
			// Validate user input against the Direction enum
			Directions direction = Directions.valueOf(userInput);

			System.out.println("Valid direction: " + direction);
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid direction entered. Please enter EAST, WEST, NORTH, or SOUTH.");
		}

		scanner.close();

	}

	enum Directions {
		EAST, WEST, NORTH, SOUTH;
	}
}
