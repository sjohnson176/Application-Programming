package programmingEx2;

public class Exercise12_01a {
	public static void main(String[] args) throws NumberFormatException {
		// check number of strings passed
		if (args.length != 3) {
			System.out.println(
				"Usage: java Calculator operand1, operator operand2");
			System.exit(0);
		}
		
		int num1 = 0;
		int num2 = 0;
		
		//make sure args[0] is an integer
		try {
			num1 = Integer.parseInt(args[0]);
		}
		catch (NumberFormatException ex) {
			System.out.println("Invalid operand: " + args[0]);
			System.exit(1);
		} 
		
		// make sure args[2] is an integer
		try {
			num2 = Integer.parseInt(args[2]);
		}
		catch (NumberFormatException ex) {
			System.out.println("Invalid operand: " + args[2]);
			System.exit(2);
		}
		
		// The result of the operation
		int result = 0;

		// determine the operator
		switch (args[1].charAt(0)) {
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
		break;
		default: System.out.println("Invalid operator");
				System.exit(3);
		}
			
		System.out.println(num1 + " " + args[1] + " " + num2 + " = " + result);
		
	}
}
