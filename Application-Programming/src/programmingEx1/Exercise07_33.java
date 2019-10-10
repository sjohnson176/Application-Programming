package programmingEx1;
import java.util.Scanner;

public class Exercise07_33 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] zodiacs = new String[12];
		zodiacs[0] = "monkey";
		zodiacs[1] = "rooster";
		zodiacs[2] = "dog";
		zodiacs[3] = "pig";
		zodiacs[4] = "rat";
		zodiacs[5] = "ox";
		zodiacs[6] = "tiger";
		zodiacs[7] = "rabbit";
		zodiacs[8] = "dragon";
		zodiacs[9] = "snake";
		zodiacs[10] = "horse";
		zodiacs[11] = "sheep";
		
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		System.out.println(zodiacs[year % 12]);
	}
}
