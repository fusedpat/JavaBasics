package com.mycompany.accessmodifier.testpackage;

import com.mycompany.accessmodifier.ProtectedMethodAndVariable;

// Accessible by only inheritance
public class ProtectedMethodAndVariableTest extends ProtectedMethodAndVariable {
//public class ProtectedMethodAndVariableTest { // this gives compilation error as it is indifferent package and do not
	// extends

	void ownMethod() {
		System.out.println(protectedVariable);
	}

	public static void main(String[] args) {

		ProtectedMethodAndVariable obj = new ProtectedMethodAndVariable();
		// System.out.println(obj.protectedVariable); // Accessing the protected
		// variable is not allowed since the instance is of parent

		System.out.println(obj.protectedStaticVariable); // protected Static variable is accessible with instance of
															// parent

		ProtectedMethodAndVariableTest child = new ProtectedMethodAndVariableTest(); // Create an instance of Child
		System.out.println(child.protectedVariable); // non-static variable is accessible thru child instance
		// variable through inheritance
		// obj.protectedMethod(); // Accessing the protected method through inheritance
	}
}