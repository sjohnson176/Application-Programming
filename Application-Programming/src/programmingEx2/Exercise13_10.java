package programmingEx2;
import java.util.Date;

public class Exercise13_10 {
	public static void main(String[] args) {
		Rectangle3 r1 = new Rectangle3(2, 2, "blue", false);
		System.out.println(r1.toString());
		System.out.println();
		
		Rectangle3 r2 = new Rectangle3(2, 2, "red", true);
		System.out.println(r2.toString());
		System.out.println();
		
		System.out.println("r1.equals(r2): " + r1.equals(r2));
	}
}

abstract class GeometricObject3 {
	protected String color = "white";
	protected boolean filled;
	protected Date dateCreated;
	
	GeometricObject3() {
		dateCreated = new Date();
	}
	
	GeometricObject3(String color, boolean filled) {
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
		return "created on: " + dateCreated + "\ncolor: " + color 
				+ "\nfilled: " + filled;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
}

class Rectangle3 extends GeometricObject3 
	implements Comparable<Rectangle3>{
	public double width;
	public double height;
	
	Rectangle3() {
		width = 1;
		height = 1;
	}
	
	Rectangle3(double w, double h) {
		width = w;
		height = h;
	}
	
	public Rectangle3(double w, double h, String color, boolean isFilled) {
		super(color, isFilled);
		width = w;
		height = h;
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
		double area = width * height;
		return area;
	}
	
	@Override
	public double getPerimeter() {
		double p = 2 * (width + height);
		return p;
		
	}
	
	@Override
	public int compareTo(Rectangle3 rec) {
		if (this.getArea() > rec.getArea()) {
			return 1;
		}
		else if (this.getArea() == rec.getArea()) {
			return 0;
		}
		else {
			return -1;
		}
	}
	
	public boolean equals(Rectangle3 rec) {
		return (this.getArea() == rec.getArea());
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