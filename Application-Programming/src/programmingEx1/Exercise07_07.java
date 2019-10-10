package programmingEx1;

public class Exercise07_07 {
	public static void main(String[] args) {
		int[] randoms = new int[100];
		for(int a = 0; a < randoms.length; a++) {
			randoms[a] = (int)(Math.random() * 10);
			if ((a + 1) % 10 == 0) {
				System.out.println(randoms[a] + " ");
			}
			else {
				System.out.print(randoms[a] + " ");
			}
		}
		System.out.println();
		
		int[] counts = new int[10];
		for(int b = 0; b < counts.length; b++) {
			for(int c = 0; c < randoms.length; c++) {
				if (randoms[c] == b) {
					counts[b]++;
				}
			}
			
			System.out.println("The count for " + b + " is " + counts[b]);
		}
	}
}