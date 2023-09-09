package com.mycompany.accessmodifier;

public class ProtectedMethodAndVariable {
	protected int protectedVariable = 10;
	
	protected static int protectedStaticVariable = 10;

    protected void protectedMethod() {
        System.out.println("This is a protected method in ClassA."+protectedVariable);
    }
}
