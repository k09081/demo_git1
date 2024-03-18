package learning_java_exceptions;

public class checkedexceptionrunner {

	public static void main(String[] args) {
		try {
			someothermethod();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		someothermethod1();

	}

	private static void someothermethod1() {

	}

	private static void someothermethod() throws InterruptedException {
		Thread.sleep(2000);
	}


}
