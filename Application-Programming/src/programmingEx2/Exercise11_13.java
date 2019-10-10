package programmingEx2;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		System.out.print("Enter ten integers: ");
		for (int a = 0; a < 10; a++) {
			list.add(input.nextInt());
		}
		
		removeDuplicates(list);
	}

	public static void removeDuplicates(ArrayList<Integer> list) {
		ArrayList<Integer> list2 = new ArrayList<>();
		for (int a = 0; a < list.size(); a++) {
			if (!list2.contains(list.get(a))) {
				list2.add(list.get(a));
			}
			else {
				continue;
			}
		}
		
		for (int b = 0; b < list2.size(); b++) {
			System.out.print(list2.get(b) + " ");
		}
	}
}
