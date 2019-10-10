package programmingEx1;

public class Exercise05_24 {

	public static void main(String[] args) {
		
		double sum = 0;
		for(int a = 1, b = 3; b <= 99;) {
			sum += (((double)a) / ((double)b));
			a = a + 2;
			b = b + 2;
		}
		
		System.out.println("The sum is " + sum);
	}

}
