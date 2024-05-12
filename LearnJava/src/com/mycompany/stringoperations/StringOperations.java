package com.mycompany.stringoperations;

import java.util.Scanner;

public class StringOperations {
	public static void main(String args[]) {

		
		String firstName = "John";
		String lastName = "Smith";
		String fullName = firstName + " " + lastName;
		
		System.out.println("full name is:" +fullName);
		
		
		// Concat
				String concat = firstName.concat(lastName);
				System.out.println(concat);
		// index of
		
		String text = "Hello World!";
		char target = ',';
		int index = text.indexOf(target);
		if (index != -1) {
		    System.out.println("The character '" + target + "' is found at index: " + index);
		} else {
		    System.out.println("The character '" + target + "' is not found in the string.");
		}

		String stringIndex = "this is index of example";

		int index1 = stringIndex.indexOf("is");// returns the index of is substring
		int index2 = stringIndex.indexOf("index");// returns the index of index substring
		System.out.println("Indexes" + index1 + "  " + index2);// 2 8
		
		
		String subString = stringIndex.substring(index1, index2);
		System.out.println("Substrings of \"" + stringIndex + "\" are :-" + subString);

		// replaceAll
		String stringToReplace = "My name is Java. My name is CPP. My name is Python.";
		System.out.println(stringToReplace);
		String replaceString = stringToReplace.replaceAll("is", "was");// replaces all occurrences of "is" to "was"
		System.out.println(replaceString);

		stringToReplace = "My name is Java. My name is CPP. My name is Python.";
		String replaceFirst = stringToReplace.replaceFirst("is", "was");// replaces first occurance of "is" to "was"
		System.out.println(replaceFirst);
		
		String phoneNumber = "(123) 456-7890";
		String formattedNumber = phoneNumber.replace("(", "")
		                                    .replace(")", "")
		                                    .replace(" ", "")
		                                    .replace("-", "");
		System.out.println("Formatted Number: " + formattedNumber);

		// Split String
		String splitString = "John,Doe,30,Engineer";
		String[] fields  = splitString.split(",");// splits the string based on whitespace
		// using java foreach loop to print elements of string array
//		for (String w : fields ) {
//			System.out.println(w);
//		}

		// Extract individual fields
        String fn = fields[0];
        String ln = fields[1];
        int age = Integer.parseInt(fields[2]);
        String occupation = fields[3];
        
        // Process the extracted fields
        System.out.println("First Name: " + fn);
        System.out.println("Last Name: " + ln);
        System.out.println("Age: " + age);
        System.out.println("Occupation: " + occupation);
		
		
		String s1 = "hello";

		// trim
		String stringTrim = "  hello string   ";
		System.out.println(stringTrim + " welcome");
		// without trim()
		System.out.println(s1.trim() + "welcome");// with trim()

		

		String str = "Hello World";

		boolean endsWithWorld = str.endsWith("World");
		System.out.println(endsWithWorld); // Output: true

		boolean endsWithHello = str.endsWith("Hello");
		System.out.println(endsWithHello); // Output: false

		String strToDemoContains = "Hello World";

		boolean containsHello = strToDemoContains.contains("Hello");
		System.out.println(containsHello); // Output: true

		boolean containsFoo = strToDemoContains.contains("Foo");
		System.out.println(containsFoo); // Output: false

		String strToDemoLastIndex = "Hello World";

		int lastIndexO = strToDemoLastIndex.lastIndexOf('o');
		System.out.println(lastIndexO); // Output: 7

		int lastIndexH = strToDemoLastIndex.lastIndexOf('H');
		System.out.println(lastIndexH); // Output: 0

		String strToDemoBlank = "";

		boolean isBlankEmpty = strToDemoBlank.isBlank();
		System.out.println(isBlankEmpty); // Output: true

		String strWhitespace = "   ";

		boolean isBlankWhitespace = strWhitespace.isBlank();
		System.out.println(isBlankWhitespace); // Output: true

		String strNonBlank = "Hello World";

		boolean isBlankNonBlank = strNonBlank.isBlank();
		System.out.println(isBlankNonBlank); // Output: false

		// equals for content comparison
		 String hello1 = "hello";
	        String hello2 = "hello";
	        String hello3 = new String("hello");
	        String hello4 = "world";
		
		 System.out.println(hello1.equals(hello2)); // true
	        System.out.println(hello1.equals(hello3)); // true
	        System.out.println(hello1.equals(hello4)); // false
		
		// == for reference comparison, not to be used for string equality
	        System.out.println(hello1 == hello2); // true
	        System.out.println(hello1== hello3 ); // false
	        System.out.println(hello1 == hello4); // false
	        
		
		String nullCheck = null;

		//System.out.println("not doing null check" + nullCheck.length()); //  throws null pointer.
		
		if (null != nullCheck)
			System.out.println("not doing null check" + nullCheck.length());

		System.out.println("bypassed null here");
		
		
	// compare to
		
		String s2 = "hello";
		String s3 = "meklo";
		String s4 = "hemlo";
		System.out.println(s1.compareTo(s2));
		
		if(s1.compareTo(s2) != 0) {
			System.out.println("string are not equal");
		}
		// Comparing "hello" and "meklo". The first different character encountered is
		// 'm' - its ASCII value is greater than 'h'. So, the result is a negative value
		// indicating that "hello" comes before "meklo" in lexicographical order. This
		// prints a negative integer.
		System.out.println(s1.compareTo(s3)); // lexicographically comparison ie.e which

		// Comparing "hello" and "hemlo". The first different character encountered is
		// 'e' - its ASCII value is greater than 'a'. So, the result is a positive value
		// indicating that "hello" comes after "hemlo" in lexicographical order. This
		// prints a positive integer.
		System.out.println(s1.compareTo(s4));

	}
}
