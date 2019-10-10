package programmingEx1;
import java.util.Scanner;

public class Exercise07_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		int numStudents = input.nextInt();
		
		String[] names = new String[numStudents];
		double[] scores = new double[numStudents];
		for(int a  = 0; a < numStudents; a++) {
			System.out.print("Enter a student name: ");
			names[a] = input.next();
			System.out.print("Enter a student score: ");
			scores[a] = input.nextDouble();
		}
		
		sortDecreasing(names, scores);
		
		System.out.println("Names in decreasing order of their scores are: ");
		for(int b = 0; b < numStudents; b++) {
			System.out.println(names[b] + " " + scores[b]);
		}
	}
	
	public static void sortDecreasing(String[] names, double[] scores) {
		for(int a = 0; a < scores.length; a++) {
			double max = scores[a];
			int maxIndex = a;
			String temp;
			
			for(int b = a + 1; b < scores.length; b++) {
				if (scores[b] > max) {
					max = scores[b];
					maxIndex = b;
				}
			}
			
			if (maxIndex != a) {
			 // swap names
				temp = names[a];
				names[a] = names[maxIndex];
				names[maxIndex] = temp;
				
			 // swap scores
			 	scores[maxIndex] = scores[a];
			 	scores[a] = max;
			}
		}
	}
}