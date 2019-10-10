package programmingEx1;
import java.util.Scanner;

public class Exercise02_06 {
	public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  
	  System.out.print("Enter a three digit integer: ");
	  int num = input.nextInt();
	  
	  int digit1 = num / 100;
	  int digit2 = (num / 10) % 10;
	  int digit3 = num % 10;
	  int sum = digit1 + digit2 + digit3; 
	   
	  
	  System.out.println("The sum of num is " + sum);
	}
}