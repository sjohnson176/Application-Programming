package programmingEx1;
import java.util.Scanner;

public class Exercise03_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int scissor = 0;
		int rock = 1;
		int paper = 2;
		
		// generate random number between 0 and 2
		int computer = (int)((Math.random() * 3));
		
		// prompt user to enter 0, 1, or 2
		System.out.print("Enter either 0 (for scissor), 1 (for rock), or 2 (paper): ");
		int player = input.nextInt();
		
		if (player == computer)
			System.out.println("Draw");
			
		else if (player == 0 && computer == 1)
			System.out.println("The computer wins");
			
		else if (player == 0 && computer == 2)
			System.out.println("The computer loses");
			
		else if (player == 1 & computer == 0)
			System.out.println("The computer wins");
			
		else if (player == computer)
			System.out.println("Draw");
			
		else if (player == 1 && computer == 2)
			System.out.println("The computer wins");	
		
		else if (player == 2 && computer == 0)
			System.out.println("The computer wins");
			
		else if (player == 2 && computer == 1)
			System.out.println("The computer loses");
		
		else if (player == computer)
			System.out.println("Draw");
		
		System.out.println("The computer played: " + computer);
	}
}