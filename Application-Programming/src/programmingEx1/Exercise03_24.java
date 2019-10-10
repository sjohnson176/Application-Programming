package programmingEx1;
import java.util.Scanner;

public class Exercise03_24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Pick a card (Enter a number between 1 and 52): ");
		int card = input.nextInt();
		
		// assign suit
		String suit = "";
		if (card <= 13){
			suit = "Clubs";
		}
		else if (card > 13 && card <= 26) {
			suit = "Diamonds";
		}
		else if (card > 26 && card <= 39) {
			suit = "Hearts";
		}
		else if (card > 39 && card <= 52) {
			suit = "Spades";
		}
		
		// assign rank
		String rank = "";
		switch (card % 13) {
		case 0: rank = "King";
		break;
		case 1: rank = "Ace";
		break;
		case 2: rank = "2";
		break;
		case 3: rank = "3";
		break;
		case 4: rank = "4";
		break;
		case 5: rank = "5";
		break;
		case 6: rank = "6";
		break;
		case 7: rank = "7";
		break;
		case 8: rank = "8";
		break;
		case 9: rank = "9";
		break;
		case 10: rank = "10";
		break;
		case 11: rank = "Jack";
		break;
		case 12: rank = "Queen";
		}
		
		System.out.println("The card you picked is " + rank + " of " + suit);
	}

}
