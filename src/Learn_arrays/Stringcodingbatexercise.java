package Learn_arrays;

public class Stringcodingbatexercise {

	public static void main(String[] args) {

	}

	public String helloName(String name) {
		String s1 = "hello";
		String s11 = "!";
		String s2 = s1 + name + s11;
		return s2;
	}

	public String makeAbba(String a, String b) {

		String str = a + b + b + a;
		return str;
	}

	public String makeTags(String tag, String word) {
		String str = "<" + tag + ">" + word + "</" + tag + ">";

		return str;
	}

	public String makeOutWord(String out, String word) {
		String str = "<" + word + ">" + "</" + word + ">";
		return str;
	}



}
