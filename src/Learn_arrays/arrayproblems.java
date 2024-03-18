package Learn_arrays;

public class arrayproblems {

	public static void main(String[] args) {
//		float sum = 0;
//		float[] array2 = { 56.0f, 90.56f, 567.56f, 32.98f, 13.98f };
//		System.out.println("The sum of number is");
//		System.out.println();
//		for (float total : array2) {
//			sum = total + sum;
//
//		}
//		System.out.println(sum + "");

		float num = 56.0f;
		boolean isinarray = false;
		float[] array2 = { 56.0f, 90.56f, 567.56f, 32.98f, 13.98f };
//		System.out.println("The sum of number is");
//		System.out.println();
		for (float total : array2) {
			if (num == total) {
				isinarray = true;
				break;
			}

			}
			
			if (isinarray) {
				System.out.println("The value is in the array");
			} else {
				System.out.println("The value is not in the array");
			}

		}

	}


