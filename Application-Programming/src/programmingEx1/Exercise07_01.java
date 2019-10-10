package programmingEx1;
import java.util.Scanner;

public class Exercise07_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of students: ");
		int numOfStudents = input.nextInt();
		
		System.out.print("Enter student test scores: ");
		double[] scores = new double[numOfStudents];
			for(int i = 0; i < scores.length; i++) {
				scores[i] = input.nextDouble();
			}
		
		double best = bestScore(scores);
		
		printStudentGrades(scores, best, numOfStudents);
	}
	
	public static double bestScore(double... scores) {
		double best = scores[0];
		
		for(int j = 1; j < scores.length; j++) {
			if (scores[j] > scores[j - 1]) {
				best = scores[j];
			}	
		}
		
		return best;
	}
	
	public static void printStudentGrades(double[] scores, double best, int numOfStudents) {
		
		
		for(int k = 0; k < numOfStudents; k++) {
			int studentIndex = k;
			
			if (scores[k] >= best - 10) {
				System.out.println("Student " + studentIndex + " score is " + 
					scores[k] + " and grade is A");
			}
			else if (scores[k] >= best - 20) {
				System.out.println("Student " + studentIndex + " score is " +
					scores[k] + " and grade is B");
			}
			else if (scores[k] >= best - 30) {
				System.out.println("Student " + studentIndex + " score is " + 
					scores[k] + " and grade is C");
			}
			else if (scores[k] >= best - 40) {
				System.out.println("Student " + studentIndex + " score is " + 
					scores[k] + " and grade is D");
			}
			else
				System.out.println("Student " + studentIndex + " score is " + 
					scores[k] + " and grade is F");
			
		}
	}
}