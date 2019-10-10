package programmingEx1;
import java.util.Scanner;

public class Exercise03_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter today's day: ");
		int today = input.nextInt();
		if (today > 6 ) {
			System.out.print("Invalid input");
			return;
		}
		System.out.print("Enter the number of days elapsed since today: ");
		int daysPast = input.nextInt();
		int newDay = today + (daysPast % 7);
		
		switch (today) {
		case 0: System.out.print("Today is Sunday and the future day is ");
		break;
		case 1: System.out.print("Today is Monday and the future day is ");
		break;
		case 2: System.out.print("Today is Tuesday and the future day is ");
		break;
		case 3: System.out.print("Today is Wednesday and the future day is ");
		break;
		case 4: System.out.print("Today is Thursday and the futre day is ");
		break;
		case 5: System.out.print("Today is Friday and the future day is ");
		break;
		case 6: System.out.print("Today is Saturday and the future day is ");
		}
		
		switch (newDay) {
		case 0: System.out.print("Sunday");
		break;
		case 1: System.out.print("Monday");
		break;
		case 2: System.out.print("Tuesday");
		break;
		case 3: System.out.print("Wednesday");
		break;
		case 4: System.out.print("Thursday");
		break;
		case 5: System.out.print("Friday");
		break;
		case 6: System.out.println("Saturday");
		}
	}
}
