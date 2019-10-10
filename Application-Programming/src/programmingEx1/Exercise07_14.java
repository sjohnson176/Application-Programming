package programmingEx1;
import java.util.Scanner;

public class Exercise07_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter five integers: ");
		int[] numbers = new int[5];
		for(int a = 0; a < numbers.length; a++) {
			numbers[a] = input.nextInt();
		}
		
		int min = min(numbers);
		int gcd = gcd(min, numbers);
		System.out.println("The gcd of these five numbers is " + gcd);
	}
	
	public static int min(int... numbers) {
		int min = numbers[0];
		
		for(int a = 0; a < numbers.length; a++) {
			if (numbers[a] < min) {
				min = numbers[a];
			}
		}
		
		return min;
	}
	
	public static int gcd(int min, int... numbers) {
		int gcd = 1;
		boolean isDivisor = true;
		
		for(int a = 2; a < min; a++) {
			isDivisor = true;
			
			for(int b = 0; b < numbers.length; b++) {
				if (numbers[b] % a != 0) {
					isDivisor = false;
				}
			}
			
			if (isDivisor) {
				gcd = a;
			}
		}
		
		return gcd;
	}
}