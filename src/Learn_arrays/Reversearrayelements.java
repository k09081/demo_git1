package Learn_arrays;

public class Reversearrayelements {

	public static void main(String[] args) {
		int[] array1 = { 45, 89, 78, 98, 56 };
		System.out.println("The elements of arrays are");
		System.out.println();
		for (int i = 0; i < array1.length; i++) {

			System.out.println(array1[i] + " ");
		}
		System.out.println();
		System.out.println("The reverse of the aarays element are");
		for (int i = array1.length - 1; i >= 0; i--) {
			System.out.println(array1[i] + " ");
		}
	}

}
