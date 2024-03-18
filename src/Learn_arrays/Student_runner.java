package Learn_arrays;

import java.math.BigDecimal;

public class Student_runner {

	public static void main(String[] args) {

		Student student = new Student("Ashish", 89, 87, 85, 86);
		Student student1 = new Student("FADJH", 89, 87, 85);
		Student student2 = new Student("ASDjffahsj", 89, 86);
		int number = student.getNumberOfmarks();
		System.out.println("Total number is " + number);
		int sum = student.getsumofmarks();
		System.out.println("Total sum of number is " + sum);
		int maximumnumber = student.getmaximumnumber();
		System.out.println("Maximum number is" + maximumnumber);
		int minimumnumber = student.getminimumnumber();
		System.out.println("The minimum number is " + minimumnumber);
		BigDecimal Average = student.getaverageofmarks();
		System.out.println("The average of  number is" + Average);
		System.out.println(student);
		student.newmark(25);
		System.out.println(student);
		student.removemarkatindex(0);
		System.out.println(student);

	}

}
