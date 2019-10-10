package programmingEx1;
import java.util.Scanner;

public class Exercise07_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter ten numbers : ");
		int[] list = new int[10];
			for(int a = 0; a < list.length; a++) {
				list[a] = input.nextInt();
			}
		
		int distinctCount = countDistinctNumbers(list);
		System.out.println("The number of distinct numbers is " + distinctCount);
		
		int[] noDups = eliminateDuplicates(list, distinctCount);
		System.out.print("The distinct numbers are ");
		for(int var : noDups) {
			System.out.print(var + " ");
		}
	}
	
	public static int countDistinctNumbers(int[] list) {
		int count = 0;
		boolean isDistinct = true;
		
		for(int a = 0; a < list.length; a++) {
			isDistinct = true;
			
			for(int b = a - 1; b >= 0; b--) {
				if (list[b] == list[a]) {
					isDistinct = false;
					break;
				}
			}
			
			if (isDistinct) {
				count++;
			}
		}
		
		return count;
	}
	
	public static int[] eliminateDuplicates(int[] list, int distinctCount) {
		int[] noDups = new int[distinctCount];
		boolean isDistinct = true;
		
		for(int a = 0, b = 0; b < noDups.length; a++) {
			isDistinct = true;
			
			for (int c = a - 1; c >= 0; c--) {
				if (list[c] == list[a]) {
					isDistinct = false;
					break;
				}
			}
			
			if (isDistinct) {
				noDups[b] = list[a];
				b++;
			}
		}
		
		return noDups;
	}
}