package programmingEx2;

public class Exercise10_26 {
	public static void main(String[] args) {
		
		// remove white space
		String[] ops = new String[3];
		for (int a = 0, b = 0; a < args.length; a++) {
			if (args[a] != " ") {
				ops[b] = args[a];
				b++;
			}
		}
		args = ops;
	        
		if(args.length != 3) {
			System.out.println(
					"Usage: java Calculator operand1 operator operand2");
			System.exit(0);
		}
		
		int result = 0;
		
		switch(args[1].charAt(0)) {
		case '+': result = 
				Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
			break;
		case '-': result =
				Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
			break;
		case '.': result =
				Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
			break;
		case '/': result =
				Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
		}
		
		System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + 
				" = " + result);
	}
}