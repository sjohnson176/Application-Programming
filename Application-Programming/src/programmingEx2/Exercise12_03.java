package programmingEx2;
import java.util.Scanner; 

public class Exercise12_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        int[] array = new int[100];
        for (int a = 0; a < array.length; a++) {
            array[a] = (int)(Math.random() * 100);
        }
       
        System.out.print("Enter an index: ");
        try {
            int index = input.nextInt();
            System.out.println("array[" + index + "] = " + array[index]);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("IndexOutOfBoundsException: " 
            		+ "specified index does not exists.");
        } catch (Exception ex) {
            System.out.println("Invalid input: Must be an integer.");
        }
	}
}
