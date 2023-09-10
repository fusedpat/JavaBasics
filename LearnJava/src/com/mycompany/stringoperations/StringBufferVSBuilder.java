package com.mycompany.stringoperations;

public class StringBufferVSBuilder {
	    public static void main(String[] args) {
	        // Using String
	        String immutableString = "Hello";
	        immutableString += " World"; // Creating a new string object
	        System.out.println("Using String (Immutable): " + immutableString);

	        // Using StringBuffer
	        StringBuffer stringBuffer = new StringBuffer("Hello");
	        stringBuffer.append(" World"); // Modifying the existing object
	        System.out.println("Using StringBuffer (Mutable): " + stringBuffer.toString());

	        // Using StringBuilder
	        StringBuilder stringBuilder = new StringBuilder("Hello");
	        stringBuilder.append(" World"); // Modifying the existing object
	        System.out.println("Using StringBuilder (Mutable): " + stringBuilder.toString());
	    }

	    
	    /**
	     * String is immutable, and any modification creates a new string object.
StringBuffer is mutable and thread-safe (synchronized).
StringBuilder is mutable but not thread-safe (unsynchronized) and is typically faster in single-threaded scenarios.
	     */
}
