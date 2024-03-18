package Learn_arrays;

import java.util.ArrayList;

public class arraylistexercise {




	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(25);
		number.add(123);
		number.add(125);
		number.set(0, 128);
		System.out.println(number);
	}

}
