package Learn_arrays;

import java.util.Scanner;

public class arrayinput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = scan.nextInt();
		int[] array3 = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the elemets of array");
			array3[i] = scan.nextInt();

		}
		scan.close();
		System.out.println();
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array3[i] + " ");
		}

	}

}
