package Learn_arrays;

public class Day_of_week {

	public static void main(String[] args) {

		String[] str = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday" };
		String daywithmostcharacters = "";
		for (String daysofweek : str) {
			if (daysofweek.length() >= daywithmostcharacters.length()) {
				daywithmostcharacters = daysofweek;

			}
		}
		System.out.println("large alphabet is" + daywithmostcharacters);
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		for (int i = str.length - 1; i >= 0; i--) {
			System.out.println(str[i]);
		}
	}

}
