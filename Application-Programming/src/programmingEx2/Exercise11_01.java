package programmingEx2;
import java.util.Date;
import java.util.Scanner;

public class Exercise11_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter the length of 3 sides of a triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		System.out.print("Enter the color of the triangle: ");
		String color = input.next();
		
		System.out.print("Is the triangle filled or not filled "
				+ "(enter true or false): ");
		boolean filled = input.nextBoolean();
		
		Triangle t = new Triangle(side1, side2, side3);
		t.setColor(color);
		t.setFilled(filled);
		
		System.out.println("The area, perimeter, and color of triangl t are "
				+ t.getArea() + " " + t.getPerimeter() + " and " 
				+ t.getColor() + " respectively. \nIt is " + t.isFilled() 
				+ " that the triangle is filled.");
	}
}
	class Triangle extends GeometricObject {
		private double side1 = 1;
		private double side2 = 1;
		private double side3 = 1;
		
		Triangle() {
			
		}
		
		Triangle(double side1, double side2, double side3) {
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		}
		
		public double getSide1() {
			return side1;
		}
		
		public double getSide2() {
			return side2;
		}
		
		public double getSide3() {
			return side3;
		}
		
		public double getArea() {
			double s = (side1 + side2 + side3) / 2;
			return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		}
		
		public double getPerimeter() {
			return side1 + side2 + side3;
		}
		
		public String toString() {
			return "triangle: side1 = " + side1 + " side2 = " + side2 
					+ " side3 = " + side3; 
		}
	}
	class GeometricObject {
		private String color = "white";
		private boolean filled;
		private Date dateCreated;
		
		public GeometricObject() {
			dateCreated = new Date();
		}
		
		public GeometricObject(String color, boolean filled) {
			dateCreated = new Date();
			this.color = color;
			this.filled = filled;
		}
		
		public String getColor() {
			return color;
		}
		
		public void setColor(String color) {
			this.color = color;
		}
		
		public boolean isFilled() {
			return filled;
		}
		
		public void setFilled(boolean filled) {
			this.filled = filled;
		}
		
		public Date getDateCreated() {
			return dateCreated;
		}
		
		public String toString() {
			return "created on: " + getDateCreated() + "\ncolor: " + getColor() 
					+ "\nfilled: " + isFilled();
		}
	}

