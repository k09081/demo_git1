package Learn_arrays;

public class arraymetricespromblems {

	public static void main(String[] args) {
		int[][] mat1 = {{1,2,4},
		                {3,5,6}};
		int[][] mat2 = { { 4, 9, 3 }, { 9, 1, 6 } };
		int[][] result= {{0,0,0},
				         {0,0,0}};

		System.out.println("The resultant are matrice is ");
		System.out.println(); // it always prints new line after next print statement.
		for(int i=0;i<mat1.length;i++) {
			for (int j = 0; j < mat1[i].length; j++) {
				result[i][j] = mat1[i][j] * mat2[i][j];

				System.out.print(result[i][j] + " ");
			}


		}

	}

}
