package programmingEx2;

public class Exercise09_09 {
	public static void main(String[] args) {
		RegularPolygon r1 = new RegularPolygon();
		RegularPolygon r2 = new RegularPolygon(6, 4);
		RegularPolygon r3 = new RegularPolygon(10, 4, 5.6, 7.8);
		
		System.out.println("The perimeter and area of r1 are " 
				+ r1.getPerimeter() + " and " + r1.getArea() 
				+ " respectively");
		System.out.println("The perimeter and area of r2 are " 
				+ r2.getPerimeter() + " and " + r2.getArea() 
				+ " respectively");
		System.out.println("The perimeter and area of r3 are " 
				+ r3.getPerimeter() + " and " + r3.getArea() 
				+ " respectively");
	}
}

class RegularPolygon {
	private int n = 3;
	private double side = 1;
	private double x = 0;
	private double y = 0;
	
	public RegularPolygon() {
		
	}
	
	public RegularPolygon(int n, double side) {
		this.n = n;
		this.side = side;
	}
	
	public RegularPolygon(int n, double side, double x, double y) {
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	
	public double getPerimeter() {
		double p = 2 * (side + side);
		
		return p;
	}
	
	public double getArea() {
		double a = (n * Math.pow(side, 2) / 4 * Math.tan((Math.PI / n)));
		
		return a;
	}
}