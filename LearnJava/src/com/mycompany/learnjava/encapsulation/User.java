package com.mycompany.learnjava.encapsulation;

public class User {
    private String username; // Observer the usage of private on methods
    private String password;
    
    public User(String username, String password) {
    	if(username.equals("john_doe")) {
    	System.out.println("not allowing this use");	
    	}
    	else {
        this.username = username;
        this.password = password;
    	}
    }
    // Observer the usage of public on methods
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
}
