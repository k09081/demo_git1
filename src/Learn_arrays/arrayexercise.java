package Learn_arrays;

import java.util.ArrayList;
import java.util.Collections;

public class arrayexercise {

	private String name;
	private ArrayList<Integer> numbers = new ArrayList<Integer>();

	public arrayexercise(String name, int... numbers) { // int... numbers is example of variable argument parameter
														// and it will be last parameter.
		this.name = name;
		for (int number1 : numbers) {
			this.numbers.add(number1);
		}

	}

	public int gettotalnumber() {
		return (numbers.size());
	}

	public int getsumtotal() {
		int sum = 0;
		for (int totalsum : numbers) {
			sum += totalsum;
		}
		return sum;
	}

	public int getmaxnumber() {
		return Collections.max(numbers);
	}

	public int getminnumber() {

		return Collections.min(numbers);
	}

	@Override
	public String toString() {
		return numbers + name;
	}

	public void addnewNumber(int number1) {
		numbers.add(number1);

	}

	public void removeNumberatindex(int number2) {
		numbers.remove(number2);
	}

}
