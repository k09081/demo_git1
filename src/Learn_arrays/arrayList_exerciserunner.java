package Learn_arrays;

public class arrayList_exerciserunner {

	public static void main(String[] args) {

		arrayexercise numbers1 = new arrayexercise("Ashish", 23, 25, 29, 89);
		arrayexercise numbers2 = new arrayexercise("Madhur", 23, 25, 29, 89);
		int total = numbers1.gettotalnumber();
		System.out.println(total);
		int sumtotal = numbers1.getsumtotal();
		System.out.println(("The total sum is " + sumtotal));
		int minnumber = numbers1.getmaxnumber();
		System.out.println("The maximum number is" + minnumber);
		int maxnumber = numbers1.getminnumber();
		System.out.println("The maximum number is " + maxnumber);
		System.out.println(numbers1);
		numbers2.addnewNumber(56);
		System.out.println(numbers2);
		numbers2.removeNumberatindex(0);
		System.out.println(numbers2);
		


	}

}
