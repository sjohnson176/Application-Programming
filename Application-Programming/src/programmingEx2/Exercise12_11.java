package programmingEx2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise12_11 {
	public static void main(String[] args) {
		
		// check if arguments are correct
		if (args.length != 2) {
			System.out.println("Invalid arguments.");
			System.out.println("Usage: key filename");
			System.exit(0);
		}
		
		// check if file exists
		File filename = new File(args[1]);
		if (!filename.exists()) {
			System.out.println(args[1] + " does not exist.");
			System.exit(1);
		}
		
		// create input and output files
		String s = "";
		try {
			Scanner input = new Scanner(filename);
			while (input.hasNext()) {
				s += input.nextLine();
			}
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		
		// remove the key from the file
		s = s.replaceAll(args[0],  "");
		
		try {
			PrintWriter output = new PrintWriter(filename);
			System.out.println(s);
			output.write(s);
			output.close();
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		
		System.out.println("Complete");
	}
}
