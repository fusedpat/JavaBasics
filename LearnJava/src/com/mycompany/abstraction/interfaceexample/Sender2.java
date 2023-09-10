package com.mycompany.abstraction.interfaceexample;

import java.io.File;
// To define the contract, but not worried about how it is implemented and who is it implementing
public interface Sender2 {
	void send(File fileToBeSent);
	
	// java 8 onwards
	default void doNotSend(File fileToBeSent) {
		System.out.println("I dont want to send");
	}
	
	
	// below are not allowed in interface
	//private int i = 0;
	//protected int j = 0;
	
	
	// only public, static, and final are allowed
	public int k = 0;
	int l = 0;
	
	
}
