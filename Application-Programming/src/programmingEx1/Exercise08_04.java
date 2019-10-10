package programmingEx1;

import java.util.Arrays;

public class Exercise08_04 {
	public static void main(String[] args) {
		String[] emps = getEmployees();
		System.out.println(Arrays.toString(emps));
		
		int[][] hours = getHours();
		int[] totals = getTotals(hours);
		System.out.println(Arrays.toString(totals));
		
		arrangeArrays(emps, totals);
	}
	
	public static String[] getEmployees() {
		String[] emps = new String[8];
		for(int a = 0; a < 8; a++) {
			emps[a] = "Employee " + a;
		}
		
		return emps;
	}
	
	public static int[][] getHours() {
		int[][] hours = {
				{2, 4, 3, 4, 5, 8, 8},
				{7, 3, 4, 3, 3, 4, 4},
				{3, 3, 4, 3, 3, 2, 2},
				{9, 3, 4, 7, 3, 4, 1},
				{3, 5, 4, 3, 6, 3, 8},
				{3, 4, 4, 6, 3, 4, 4},
				{3, 7, 4, 8, 3, 8, 4},
				{6, 3, 5, 9, 2, 7, 9}
		};
		
		return hours;
	}
	
	public static int[] getTotals(int[][] hours) {
		int[] totals = new int[8];
		for(int a = 0; a < hours.length; a++) {
			int total = 0;
			for(int b = 0; b < hours[a].length; b++) {
				total += hours[a][b];
			}
			totals[a] = total;
		}
		
		return totals;
	}
	
	public static void arrangeArrays(
			String[] emps, int[] totals) {
		int[] decrTotals = totals;
		String[] employees = emps;
		
		for(int a = 0; a < decrTotals.length; a++) {
			int max = decrTotals[a];
			int maxIndex = a;
			
			for(int b = a + 1; b < decrTotals.length; b++) {
				if (max <= decrTotals[b]) {
					max = decrTotals[b];
					maxIndex = b;
				}
				else {
					continue;
				}
			}
			
			if (maxIndex != a) {
				int tempNum = decrTotals[a];
				decrTotals[a] = decrTotals[maxIndex];
				decrTotals[maxIndex] = tempNum;
				
				String tempStr = employees[a];
				employees[a] = employees[maxIndex];
				employees[maxIndex] = tempStr;
			}
			else {
				continue;
			}		
		}
		
		printTotals(employees, decrTotals);
		
	}
	
	public static void printTotals(String[] employees, int[] decrTotals) {
		for(int a = 0;  a < employees.length; a++) {
			System.out.println(employees[a] + ": " + decrTotals[a]);
		}
	}
}
