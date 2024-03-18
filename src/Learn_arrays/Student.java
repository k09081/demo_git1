package Learn_arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Student {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student(String name, int... marks) { // variable argument like (int...marks) is the last argument passed in
												// the
												// methods.
		this.name = name;
		for (int mark : marks) {
			this.marks.add(mark);
		}

	}

	public int getNumberOfmarks() {

		return marks.size();
	}

	public int getsumofmarks() {
		int sum = 0;
		for (int totalsum : marks) {
			sum += totalsum;
		}
		return sum;
	}

	public int getmaximumnumber() {
		int maximum = Integer.MIN_VALUE; // for maximum value we use .MIN_VALUE and vice versa for minimum
		for (int mark : marks) {
			if (mark > maximum) {
				maximum = mark;
			}
		}

		return maximum;
	}

	public int getminimumnumber() {
		int minimum = Integer.MAX_VALUE;
		for (int mark : marks) {
			if (mark < minimum) {
				minimum = mark;
			}
		}

		return minimum;
	}

	public BigDecimal getaverageofmarks() {
		int totalmarks=getNumberOfmarks();
		int total = getsumofmarks();
		return new BigDecimal(total).divide(new BigDecimal(totalmarks), 3, RoundingMode.UP);
	}

	@Override
	public String toString() { // examples of two string methods
		return name + marks;
	}

	public void newmark(int mark) {
		marks.add(mark);
	}

	public void removemarkatindex(int index) {
		marks.remove(index);

	}

}
