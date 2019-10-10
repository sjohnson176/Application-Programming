package programmingEx2;
import java.util.Scanner;
import java.util.Date;

public class Exercise13_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three sides of a triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		System.out.println();
		
		System.out.println("Enter the color of the triangle: ");
		input.nextLine();
		String color = input.nextLine();
		System.out.println();
		
		
		boolean isFilled = false;
		while (true) {
			System.out.print("Is the triangle filled? "
					+ "(enter true or false): ");
			String answerFilled = input.next();
			
			if (answerFilled.equalsIgnoreCase("true")) {
				isFilled = true;
				break;
			}
			else if (answerFilled.equalsIgnoreCase("false")) {
				isFilled = false;
				break;
			}
			else {
				System.out.println("Invalid input.\n" 
						+ "Enter 0 for false and 1 for true: ");
			}
		}
		
		GeometricObject1 tri = new Triangle1(side1, side2, side3, color,
				isFilled);
		System.out.println(tri.toString());
	}
}

abstract class GeometricObject1 {
	protected String color = "white";
	protected boolean isFilled;
	protected Date dateCreated;
	
	protected GeometricObject1() {
		dateCreated = new Date();
	}
	
	protected GeometricObject1(String color, boolean filled) {
		dateCreated = new Date();
		this.color = color;
		this.isFilled = filled;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return isFilled;
	}
	
	public void setFilled(boolean filled) {
		this.isFilled = filled;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public String toString() {
		return "created on: " + dateCreated + "\ncolor: " + color 
				+ "\nfilled: " + isFilled;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
}

class Triangle1 extends GeometricObject1 {
	protected double side1;
	protected double side2;
	protected double side3;
	
	public Triangle1() {
		this.side1 = 0;
		this.side2 = 0;
		this.side3 = 0;
	}
	
	public Triangle1(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public Triangle1(double side1, double side2, double side3, String color,
			boolean isFilled) {
		super(color, isFilled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	@Override
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
	
	@Override
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	@Override
	public String toString() {
		return "area: " + getArea()
			+ " perimeter: " + getPerimeter() + "\ncreated on: " + dateCreated 
			+ " color: " + color + " filled: " + isFilled;
	}
}