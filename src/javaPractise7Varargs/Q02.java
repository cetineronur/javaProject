package javaPractise7Varargs;

public class Q02 {

	public static void main(String[] args) {
		// verilen int lerden ilki haric tum sayilari toplayan ve
		// buldugunuz toplam ile ilk sayiyi carpip sonucu yazdiriniz.

		yazdir(5, 8, 10, 15);
		yazdir(5, 8, 10, 15, 25);

	}

	private static void yazdir(int a, int... b) {
		int topla = 0;
		int sonuc;
		for (int i : b) {
			topla += i;
		}
		sonuc = a * topla;
		System.out.println(sonuc);

	}

}
