package programmingEx1;

public class Exercise05_18d {
	public static void main(String[] args) {
		for(int a = 1; a <= 6; a++) {
			if (a == 6) {
				System.out.println("          6");
			}
			else if (a == 5) {
				System.out.println("        5 6");
			}
			else if (a == 4) {
				System.out.println("      4 5 6");
			}
			else if (a == 3) {
				System.out.println("    3 4 5 6");
			}
			else if (a == 2) {
				System.out.println("  2 3 4 5 6");
			}
			else {
				System.out.println("1 2 3 4 5 6");
			}
		}
	}
}
