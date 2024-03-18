package Learn_arrays;

public class Arraymetrices {

	public static void main(String[] args) {

		int[][] mat3 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] mat4 = { { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } };
		int[][] result = new int[3][3];

		System.out.println("The resultant matrices are");
		System.out.println();
		for (int i = 0; i < mat3.length; i++) {
			for (int j = 0; j < mat3[i].length; j++) {

				if (mat4[i][j] == mat3[i][j]) {
					System.out.println("matrices are equal");
				}
				
			}
		}

	}
}
	