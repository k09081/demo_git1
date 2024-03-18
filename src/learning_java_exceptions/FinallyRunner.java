package learning_java_exceptions;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);

		int[] array = { 1, 2, 3, 4 };
		int number = array[5];




	} catch (Exception ex) {
		ex.printStackTrace();
	} finally {
		if (scanner != null) {
		scanner.close();
		}
		System.out.println("before scanner close");
	}
	System.out.println("just before closing the main");

	}

}
