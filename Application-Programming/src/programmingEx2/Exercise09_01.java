package programmingEx2;

public class Exercise09_01 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4, 40);
		Rectangle r2 = new Rectangle(3.5, 35.9);
		
		System.out.println("The width, height, area, and perimeter of r1 are "
				+ r1.width + " " + r1.height + " " + r1.getArea() 	
				+ " and " + r1.getPerimeter() + " respectively ");
		
		System.out.println("The width, height, area, and perimeter of r2 are "
				+ r2.width + " " + r2.height + " " + r2.getArea()
				+ " and " + r2.getPerimeter() + " respectively");
	}
}

class Rectangle {
	public double width;
	public double height;
	
	public Rectangle() {
		width = 1;
		height = 1;
	}
	
	public Rectangle(double w, double h) {
		width = w;
		height = h;
	}
	
	public double getArea() {
		double area = width * height;
		return area;
	}
	
	public double getPerimeter() {
		double p = 2 * (width + height);
		return p;
		
	}
}
