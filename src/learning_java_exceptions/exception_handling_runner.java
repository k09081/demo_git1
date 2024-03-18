package learning_java_exceptions;

public class exception_handling_runner {

	public static void main(String[] args) {

		method1();
		System.out.println("main ended");

	}

	private static void method1() {
		method2();
		System.out.println("method1 ended");
	}

	private static void method2() {
		try {
//		String str = null;
//		str.length();
			int[] i = { 1, 2, 3 };
			int j = i[4];
			System.out.println(j);
	} catch (NullPointerException ex) {
		ex.printStackTrace();
	} catch (Exception ex) {
		System.out.println("Matched exception");
		ex.printStackTrace();


	}

	}

}
