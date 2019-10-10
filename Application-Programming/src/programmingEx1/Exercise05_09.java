package programmingEx1;
import java.util.Scanner;

public class Exercise05_09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of students: ");
		final int numberOfStudents = input.nextInt();
		String nameHigh = "";
		String nameHigh2 = "";
		double highScore = 0;
		double highScore2 = 0;
		
		for (int count = 0; count < numberOfStudents; count++) {
			System.out.print("Enter a student name: ");
			String newName = input.next();
			
			System.out.print("Enter a student score: ");
			double newScore = input.nextDouble();
			
			if (newScore > highScore) {
				highScore2 = highScore;
				highScore = newScore;
				nameHigh2 = nameHigh;
				nameHigh = newName;
			}
			else if (newScore <= highScore) {
				if (newScore <= highScore2) {
					continue;
				}
				highScore2 = newScore;
				nameHigh2 = newName;
			} 
				
		}
		
		System.out.println("Top 2 students: ");
		System.out.println(nameHigh + "'s score is " + highScore);
		System.out.println(nameHigh2 + "'s score is " + highScore2);
	}
}