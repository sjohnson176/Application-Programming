package programmingEx2;

public class Exercise12_01b {
	public static void main(String[] args) {
		// check number of strings passed
		if (args.length != 3) {
			System.out.println("Usage: java Calculator operand1 operator operand2");
			System.exit(0);
		}
		
		// check if first string is an int
		if (!isInteger(args[0])) {
			System.out.println("Invalid operator " + args[0]);
			System.exit(1);
		}
		
		// check if second string is an int
		if (!isInteger(args[2])) {
			System.out.println("Invalid operator " + args[2]);
			System.exit(2);
		}
		
		// the result of the operation
		int result = 0;
		
		// determine the operator
		switch (args[1].charAt(0)){
			case '+': result = Integer.parseInt(args[0]) +
								Integer.parseInt(args[2]);
								break;
			case '-': result = Integer.parseInt(args[0]) -
								Integer.parseInt(args[2]);
								break;
			case '.': result = Integer.parseInt(args[0]) *
								Integer.parseInt(args[2]);
								break;
			case '/': result = Integer.parseInt(args[0]) /
								Integer.parseInt(args[2]);
			default: System.out.println("Invalid operator");
						System.exit(3);
		}
		
		// display result
		System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + result);
	}
	
	public static boolean isInteger(String str1) {
		for (int a = 0; a < str1.length(); a++) {
			if (str1.charAt(a) >= '0' && str1.charAt(a) <= '9') {
				continue;
			}
			else {
				return false;
			}
		}
		
		return true;
	}
}
