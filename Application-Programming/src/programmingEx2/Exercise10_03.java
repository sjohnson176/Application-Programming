package programmingEx2;

public class Exercise10_03 {
	public static void main(String[] args) {
		// create MyInteger object
		MyInteger obj = new MyInteger(153);
		
		// test getValue method
		System.out.println("getValue method: " + obj.getValue());
		
		// test isEven, isOdd, and isPrime methods
		System.out.println("isEven method: " + obj.isEven());
		System.out.println("isOdd method: " + obj.isOdd());
		System.out.println("isPrime method: " + obj.isPrime());
		
		// test isEven, isOdd, isPrime static methods
		System.out.println("isEven static method: " + obj.isEven(4));
		System.out.println("isOdd static method: " + obj.isOdd(5));
		System.out.println("isPrime static method: " + obj.isPrime(5));
		
		// test isEven, isOdd, isPrime MyInteger static methods
		System.out.println("isEven static MyInteger method: " + obj.isEven(obj));
		System.out.println("isOdd static MyInteger method: " + obj.isOdd(obj));
		System.out.println("isPrime static MyInteger method: " + obj.isPrime(obj));
		
		// equals int and MyInteger methods
		System.out.println("equals(int) method: " + obj.equals(45));
		System.out.println("equals(MyInteger) method: " + obj.equals(obj));
		
		// test parseInt
		char[] chars = {'1', '5', '3'};
		System.out.println("parseInt method char[]: " + obj.parseInt(chars));
		String str = "153";
		System.out.println("parseInt method String: " + obj.parseInt(str));
	}
}

class MyInteger {

	private int value;
	
	public MyInteger(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isEven() {
		if (value % 2 == 0) {
			return true;
		}
		
		return false;
	}
	
	public boolean isOdd() {
		if (value % 2 != 0) {
			return true;
		}
		
		return false;
	}
	
	public boolean isPrime() {
		for (int divisor = 2;  divisor <= value / 2; divisor++) {
			if (value % divisor == 0) {
				return false;
			}
		}
		
		return false;
	}
	
	static boolean isEven(int n) {
		if (n % 2 == 0) {
			return true;
		}
		
		return false;
	}
	
	static boolean isOdd(int n) {
		if (n % 2 != 0) {
			return true;
		}
		
		return false;
	}
	
	static boolean isPrime(int n) {
		for (int divisor = 2; divisor <= n / 2; divisor++) {
			if (n % divisor == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean isEven(MyInteger n) {
		if (n.getValue() % 2 == 0) {
			return true;
		}
		
		return false;
	}
	
	public static boolean isOdd(MyInteger n) {
		if (n.getValue() % 2 != 0) {
			return true;
		}
		
		return false;
	}
	
	public static boolean isPrime(MyInteger n) {
		for (int divisor = 2; divisor <= n.getValue() / 2; divisor++) {
			if (n.getValue() % divisor == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public boolean equals(int n) {
		if (value == n) {
			return true;
		}
		
		return false;
	}
	
	public boolean equals(MyInteger n) {
		if (value == n.getValue()) {
			return true;
		}
		
		return false;
	}
	
	public static int parseInt(char[] chars) {
		String num = new String(chars);
		Integer n = new Integer(num);
		
		return n;
	}
	
	public static int parseInt(String str) {
		return new Integer(str);
	}
}