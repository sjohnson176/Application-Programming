package programmingEx1;
public class Exercise06_10 {
	public static void main(String[] args) {
		// print number of prime numbers less than 10k
		final int cap = 10000;
		
		System.out.println("The number of prime numbers < 10000 is " 
				+ primeNumbersLess10K(cap));
		
	}
	
	public static int primeNumbersLess10K(int cap) {
	// find the amount of prime numbers less than 10k
	// return the amount of prime numbers
	
	int count = 0;
	int number = 2;
	
	for (; number < cap; number++) {
		
		if (isPrime(number))
			count++;
	}
	
	return count;
	}
	
	public static boolean isPrime(int number) {
		boolean isPrime = true;
		
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) {
				isPrime = false;
				break;
			}
		}
		
		return isPrime;
	}
}