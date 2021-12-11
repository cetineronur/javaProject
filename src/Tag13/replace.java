package Tag13;
public class replace {
	public static void main(String[] args) {
		// String olarak verilen 10.000 sayisinin binden buyuk olup olmadigini yazdirin
		
		String sonuc ="10.000";
		sonuc=sonuc.replace(".", ""); // 10000'e cevirip sonuca assign ettik
		System.out.println(sonuc);
		
		if (Integer.valueOf(sonuc)>1000) { //stringi integera cevirdik.
			System.out.println("bulunan sonuc sayisi 1000'den buyuktur.");
		}else {
			System.out.println("bulunan sonuc sayisi 1000'den azdir.");
		}

	}

}
