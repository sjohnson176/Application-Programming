package programmingEx1;
import java.util.Scanner;

public class Exercise08_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of cities: ");
		int numCities = input.nextInt();
		
		System.out.print("Enter the coordinates of the cities: ");
		double[][] coordinates = new double[numCities][2];
		for(int a  = 0; a < coordinates.length; a++) {
			coordinates[a][0] = input.nextDouble();
			coordinates[a][1] = input.nextDouble();
		}
		
		double[] centralCity = centralCity(coordinates);
		
		System.out.println("The central city is at " +
			"(" + centralCity[0] + ", " + centralCity[1] + ")");
		
		System.out.println("The total distance to all other cities is " + 
			centralCity[2]);
	}
	
	public static double[] centralCity(double[][] coordinates) {
		double shortestDistance = 0;
		double[] centralCity = new double[3];
		for(int a = 0; a < 1; a++) {
			for(int b = 1; b < coordinates.length; b++) {
				double x1 = coordinates[a][0];
				double y1 = coordinates[a][1];
				double x2 = coordinates[b][0];
				double y2 = coordinates[b][1];
				shortestDistance += 
					Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
			}
			centralCity = new double[]
				{coordinates[a][0], coordinates[a][1], shortestDistance};
		}
		
		for(int c = 1; c < coordinates.length; c++) {
			double distance = 0;
			
			for(int d = 0; d < coordinates.length; d++) {
				if (d == c) {
					continue;
				}
				double x1 = coordinates[c][0];
				double y1 = coordinates[c][1];
				double x2 = coordinates[d][0];
				double y2 = coordinates[d][1];
				distance += 
					Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
			}
			
			if (distance < shortestDistance) {
				shortestDistance = distance;
				centralCity = new double[]
					{coordinates[c][0], coordinates[c][1], shortestDistance};
			}
		}
		
		return centralCity;
	}
}