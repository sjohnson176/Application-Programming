package programmingEx2;
import java.util.Date;

public class Exercise13_05 {
	public static void main(String[] args) {
		GeometricObject2 c1 = new Circle2(5, "red", true);
		System.out.println("Circle 1: \n"
				+ c1.toString());
		System.out.println();
		
		GeometricObject2 c2 = new Circle2(10, "blue", false);
		System.out.println("Circle 2: \n"
				+ c2.toString());
		System.out.println();
		
		// display the larggest circle
		GeometricObject2 maxCircle = GeometricObject2.max(c1, c2);
		System.out.println("The larger of the two circles: \n"
				+ maxCircle.toString());
		System.out.println();
		
		GeometricObject2 r1 = new Rectangle2(3, 3, "orange", true);
		System.out.println("Rectangle 1: \n" 
				+ r1.toString());
		System.out.println();
		
		GeometricObject2 r2 = new Rectangle2(6, 6, "black", true);
		System.out.println("Rectangle 2: \n" 
				+ r2.toString());
		System.out.println();
		
		// display the largest rectangle
		GeometricObject2 maxRectangle = GeometricObject2.max(r1, r2);
		System.out.println("The larger of the two rectangles: \n"
				+ maxRectangle.toString());
		System.out.println();
		
	}
}

abstract class GeometricObject2 implements Comparable<GeometricObject2> {
	protected String color = "white";
	protected boolean isFilled;
	protected Date dateCreated;
	
	protected GeometricObject2() {
		dateCreated = new Date();
	}
		
	protected GeometricObject2(String color, boolean filled) {
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
	
	public int compareTo(GeometricObject2 obj) {
		if (this.getArea() > obj.getArea()) {
			return 1;
		}
		else if (this.getArea() == obj.getArea()) {
			return 0;
		}
		else {
			return -1;
		}
	}
	
	public static GeometricObject2 max(GeometricObject2 obj1, GeometricObject2 obj2) {
		GeometricObject2 max;
		if (obj1.getArea() >= obj2.getArea()) {
			max = obj1;
		}
		else {
			max = obj2;
		}
		
		return max;
	}
}

class Rectangle2 extends GeometricObject2 {
	private double width;
	private double height;
	
	public Rectangle2() {
		super();
	}
	
	public Rectangle2(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public Rectangle2(double width, double height, String color,
			boolean filled) {
		super(color, filled);
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return width * height;
	}
	
	@Override
	public double getPerimeter() {
		return 2 * (width + height);
	}
	
	@Override
	public String toString() {
		return "The rectangle was created on: " + dateCreated
				+ "\nThe width and height are: " + getWidth() + " and "
				+ getHeight()
				+ "\nThe  area is: " + getArea() 
				+ "\nThe perimeter is " + getPerimeter(); 
	}
}

class Circle2 extends GeometricObject2 {
	private double radius;
	
	public Circle2() {
		super();
	}
	
	public Circle2(double radius) {
		super();
		this.radius = radius;
	}
	
	public Circle2(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	@Override
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
	public double getDiameter() {
		return 2 * radius;
	}
	
	public String toString() {
		return "The circle was created on: " + getDateCreated() 
			+ "\nThe radius is " + radius
			+ "\nThe area is: " + getArea()
			+ "\nThe perimeter is: " + getPerimeter();
	}
}