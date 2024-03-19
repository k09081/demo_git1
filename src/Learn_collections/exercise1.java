package Learn_collections;

import java.util.ArrayList;
import java.util.Iterator;

public class exercise1 {

	public static void main(String[] args) {
//		List<String> names = List.of("Ajay", "Vijay", "Sujay");

		ArrayList<String> name = new ArrayList<String>();
		name.add("sujay");
		name.add("amit");
		name.add("abhay");
		name.add("sujay");


		Iterator namesiterator = name.iterator();
		while (namesiterator.hasNext()) {
			System.out.println(namesiterator.next());
		}

	}

}

class exercise2 {
	public void main()
	{

		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(100);
		number.add(101);
		number.add(102);
		number.add(103);

		Iterator numbersiterator = number.iterator();
		while (numbersiterator.hasNext()) {
			System.out.println(numbersiterator.next());
		}

	}
}
