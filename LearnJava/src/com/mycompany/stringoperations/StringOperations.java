package com.mycompany.stringoperations;

import java.util.Scanner;

public class StringOperations {
	public static void main(String args[]) {

		String string, sub;
		int c, length;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string to print it's all substrings");
		string = in.nextLine();
		length = string.length();

		String subString = string.substring(0, 4);
		System.out.println("Substrings of \"" + string + "\" are :-" + subString);
		
		

		// compare to
		String s1 = "hello";
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
	        
		// index of

		String stringIndex = "this is index of example";

		int index1 = stringIndex.indexOf("is");// returns the index of is substring
		int index2 = stringIndex.indexOf("index");// returns the index of index substring
		System.out.println(index1 + "  " + index2);// 2 8

		// replaceAll
		String stringReplace = "My name is Java. My name is CPP. My name is Python.";
		String replaceString = stringReplace.replaceAll("is", "was");// replaces all occurrences of "is" to "was"
		System.out.println(replaceString);

		String replaceFirst = stringReplace.replaceFirst("is", "was");// replaces first occurance of "is" to "was"
		System.out.println(replaceFirst);

		// Split String
		String splitString = "java string split method by Technolamror";
		String[] words = splitString.split("\\s");// splits the string based on whitespace
		// using java foreach loop to print elements of string array
		for (String w : words) {
			System.out.println(w);
		}

		String allPrograms = "java;CPP;Python;";
		String[] programs = allPrograms.split(";");// splits the string based on whitespace
		// using java foreach loop to print elements of string array
		for (String w : programs) {
			System.out.println(w);
		}

		// trim
		String stringTrim = "  hello string   ";
		System.out.println(stringTrim + " welcome");
		// without trim()
		System.out.println(s1.trim() + "welcome");// with trim()

		// Concat
		String concat = stringTrim.concat("Learning is fun");
		System.out.println(concat);

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

		String nullCheck = null;

		System.out.println("not doing null check" + nullCheck.length()); //  throws null pointer.
		
		if (null != nullCheck)
			System.out.println("not doing null check" + nullCheck.length());

		System.out.println("bypassed null here");

	}
}
