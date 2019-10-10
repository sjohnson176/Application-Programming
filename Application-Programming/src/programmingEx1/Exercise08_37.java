package programmingEx1;
import java.util.Scanner;

public class Exercise08_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[][] sc = getStatesAndCapitals();
		
		int correct = getScore(sc);
		
		System.out.println("The correct count is " + correct);
	}
	
	public static String[][] getStatesAndCapitals() {
		String[][] x = {
				{"Alabama", "Montgomery"}, {"Alaska", "Juneau"}, {"Arizona", "Phoenix"},
				{"Arkansas", "Little Rock"}, {"California", "Sacramento"},
				{"Colorado", "Denver"}, {"Connecticut", "Hartford"}, 
				{"Delaware", "Dover"}, {"Florida", "Tallahassee"}, 
				{"Georgia", "Atlanta"},{"Hawaii", "Honolulu"}, {"Idaho", "Boise"},
				{"Illinois", "Springfield"}, {"Indiana", "Indianapolis"},
				{"Iowa", "Des Moines"}, {"Kansas", "Topeka"}, {"Kentucky","Frankfort"}, 
				{"Louisiana", "Baton Rouge"}, {"Maine", "Augusta"}, 
				{"Maryland", "Annapolis"}, {"Massachusetts", "Boston"}, 
				{"Michigan", "Lansing"}, {"Minnesota", "Saint Paul"}, 
				{"Mississippi", "Jackson"}, {"Missouri", "Jefferson City"}, 
				{"Montana", "Helena"}, {"Nebraska", "Lincoln"}, 
				{"Nevada", "Carson City"}, {"New Hampshire", "Concord"}, 
				{"New Jersey", "Trenton"}, {"New York", "Albany"},
				{"New Mexico", "Santa Fe"}, {"North Carolina", "Raleigh"}, 
				{"North Dakota", "Bismarck"},{"Ohio", "Columbus"},
				{"Oklahoma", "Oklahoma City"}, {"Oregon", "Salem"}, 
				{"Pennsylvania", "Harrisburg"}, {"Rhode Island", "Providence"}, 
				{"South Carolina", "Columbia"}, {"South Dakota", "Pierre"}, 
				{"Tennessee", "Nashville"}, {"Texas", "Austin"}, 
				{"Utah", "Salt Lake City"}, {"Vermont", "Montpelier"}, 
				{"Virginia", "Richmond"}, {"Washington", "Olympia"}, 
				{"West Virginia", "Charleston"}, {"Wisconsin", "Madison"}, 
				{"Wyoming", "Cheyenne"}};
		
		return x;
	}
	
	public static int getScore(String[][] sc) {
		Scanner input = new Scanner(System.in);
		
		int correct = 0;
		
		for(int a = 0; a < sc.length; a++) {
				System.out.print("What is the capital of " + sc[a][0] + "? ");
				String answer = input.nextLine();
				if (answer.equalsIgnoreCase(sc[a][1])) {
					System.out.println("Your answer is correct");
					correct++;
				}
				else {
					System.out.println("The correct answer should be " + 
							sc[a][1]);
					continue;
				}
		}
		
		return correct;
	}
}
