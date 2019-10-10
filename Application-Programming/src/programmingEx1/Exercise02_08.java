package programmingEx1;
import java.util.Scanner;

public class Exercise02_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// get current time in milliseconds
		long totalMillis = System.currentTimeMillis();
		// obtain total seconds
		long totalSeconds = totalMillis / 1000;
		// obtain current seconds
		long currentSeconds = totalSeconds % 60;
		// obtain the total minutes
		long totalMinutes = totalSeconds / 60;
		// obtain the current minutes
		long currentMinutes = totalMinutes % 60;
		// obtain total hours
		long totalHours = totalMinutes / 60;
		// obtain current hours 
		long currentHours = totalHours % 24;
		
		System.out.print("Enter the time zone offset to GMT: ");
		int offset = input.nextInt();
		long offsetHours = currentHours + offset;
		
		System.out.println("Current time is " + offsetHours + ":" 
		+ currentMinutes + ":" + currentSeconds);
	}

}
