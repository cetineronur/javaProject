package javaPractise7Varargs;

public class Q01 {
	public static void main(String[] args) {
		// verilen Stringleri birlestiren concat isimli bir method olusturunuz
		// input : "m", "e", "r", "v", "e";
		// output : merve

		concat("m", "e", "r", "v", "e");
		concat(" hanim", " basarili ", "qa");
	}

	private static void concat(String... c) {

		String concat = "";
		for (String i : c) {
			concat += i;
		}
		System.out.print(concat);

	}

}
