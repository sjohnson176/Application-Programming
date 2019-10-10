package programmingEx1;

public class Exercise05_18c {
	public static void main(String[] args) {
		for(int a = 1; a <= 6; a++) {
			if (a == 1) {
				System.out.println("          1");
			}
			else if (a == 2) {
				System.out.println("        2 1");
			}
			else if (a == 3) {
				System.out.println("      3 2 1");
			}
			else if (a == 4) {
				System.out.println("    4 3 2 1");
			}
			else if (a == 5) {
				System.out.println("  5 4 3 2 1");
			}
			else {
				System.out.println("6 5 4 3 2 1");
			}
		}
	}
}
