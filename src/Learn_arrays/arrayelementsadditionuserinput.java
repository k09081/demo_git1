package Learn_arrays;

import java.util.Scanner;

public class arrayelementsadditionuserinput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = scan.nextInt();
		int[] array2 = new int[size];
		int sum = 0;
		System.out.println("Enter the elements of array");
		for (int i = 0; i < size; i++) {
			array2[i] = scan.nextInt();
		}
		for (int i = 0; i < array2.length; i++) {
			sum = sum + array2[i];

		}
		System.out.println("total sum of elements is" + sum);


	}

}
