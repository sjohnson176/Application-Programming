package programmingEx2;
import java.util.Scanner;

public class Exercise09_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter values for a, b, c, d, e, and f " 
				+ "repectively: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		LinearEquation e1 = new LinearEquation(a, b, c, d, e, f);
		
		if (!e1.isSolvable()) {
			System.out.println("The equation has no solution");
			return;
		}
		else {
			System.out.println("x is " + e1.getX() + " and y is " 
					+ e1.getY());
		}
	}
}

class LinearEquation {

	private double a,b,c,d,e,f;
	
	public LinearEquation(double a, double b, double c,
			double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}
	
	public boolean isSolvable() {
		if ((a * d - b * c) == 0) {
			return false;
		}
		
		return true;
	}
	
	public double getX() {
		double x = (e * d - b * f) / (a * d - b * c);
		
		return x;
	}
	
	public double getY() {
		double y = (a * f - e * c) / (a * d - b * c);
		
		return y;
	}
}