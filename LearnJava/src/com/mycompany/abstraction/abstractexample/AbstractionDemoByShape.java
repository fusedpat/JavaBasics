package com.mycompany.abstraction.abstractexample;

abstract class Shape {
	// Abstract method
	public abstract double calculateArea();

	// Non-abstract method
	public void display() {
		System.out.println("This is a shape.");
	}
}
class Circle extends Shape {
	private double radius;

	public Circle() {
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
}

class Rectangle extends Shape {
	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	public Rectangle() {
	}
	
	@Override
	public double calculateArea() {
		return length * width;
	}

}

public class AbstractionDemoByShape {
	public static void main(String[] args) {

		/*
		 * By allowing the Shape class to have a mixture of abstract and non-abstract
		 * methods, we achieve partial abstraction. The abstract method calculateArea()
		 * enforces that every subclass must provide its own implementation, while the
		 * non-abstract method display() provides a default implementation that can be
		 * used by all subclasses.
		 */
		Circle circle = new Circle(5);
		circle.display();
		System.out.println("Area: " + circle.calculateArea());

		Rectangle rectangle = new Rectangle(4, 6);
		rectangle.display();
		System.out.println("Area: " + rectangle.calculateArea());
		
		/** 
		 * Run time polymorphsm with abstract classes
		 */
		Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();

        shape1.display(); // Calls the display() method of Circle
        shape2.display(); // Calls the display() method of Rectangle
        
        //Shape shape3 = new Shape(); // Cannot instantiate abstract class, so this will give compile time error
	}
}
