package Learn_arrays;

public class arrayproblems3codewithharry {

	public static void main(String[] args) {
		int[] marks = { 45, 90, 87, 67, 65, 43 };
		int sum = 0;
		float average = 0;
		System.out.println("The average of number");
		System.out.println();
		for (int totalnumber : marks) {
			sum = totalnumber + sum;
			average = totalnumber / marks.length;

		}
		System.out.println(average + " ");

	}

}
