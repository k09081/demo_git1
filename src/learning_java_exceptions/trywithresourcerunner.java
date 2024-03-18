package learning_java_exceptions;

import java.util.Scanner;

public class trywithresourcerunner {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) { // new features try with resource included in java7
			;
			int[] numbers = { 1, 2, 6, 89 };
			int number = numbers[21];
		}
	}

}
