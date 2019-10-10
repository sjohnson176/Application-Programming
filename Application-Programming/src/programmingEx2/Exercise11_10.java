package programmingEx2;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		MyStack stack = new MyStack();
		int a = 5;
		System.out.print("Enter 5 strings: ");
		while (a > 0) {
			stack.push(input.nextLine());
			a--;
		}
		
		for (int b = stack.getSize() - 1; b >= 0; b--) {
			System.out.println(stack.pop());
		}
	}
}

class MyStack extends ArrayList {
	
	public boolean isEmpty() {
		return super.isEmpty();
	}
	public int getSize() {
		return size();
	}
	public void push(Object str) {
		add(str);
	}
	
	public Object peek() {
		return get(getSize() - 1);
	}
	
	public Object pop() {
		Object obj = get(getSize() - 1);
		remove(obj);
		return obj;
	}
	
	
}
