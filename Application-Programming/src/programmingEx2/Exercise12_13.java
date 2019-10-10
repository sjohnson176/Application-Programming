package programmingEx2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise12_13 {
	public static void main(String[] args) throws Exception {
		// check if arguments are correct
		if (args.length != 1) {
			System.out.println("Usage: filename");
			System.exit(0);
		}
		// check if file exists
		File file = new File(args[0]);
		if (!file.exists()) {
			System.out.println("File " + args[0] + " does not exists");
			System.exit(1);
		}
		
		int chars = 0;
		int words = 0;
		int lines = 0;
		
		try (
				// create input file
				Scanner input = new Scanner(file);
		) {
			while (input.hasNext()) {
				lines++;
				input.nextLine();
				chars++;
			}
		}
		
		try (
				// create input file
				Scanner input = new Scanner(file)
		) {
			while (input.hasNext()) {
				String s = input.next();
				words++;
			}
		}
		
		// display results
		System.out.println("File " + file.getName() + " has");
		System.out.println(chars + " characters");
		System.out.println(words + " words");
		System.out.println(lines + " lines");
	}
}
