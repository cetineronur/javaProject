package day10;

import java.util.Locale;

public class stringManupilationConcat {
	public static void main(String[] args) {
		// String olarak verilen bir degiskeni + ile baska bir degiskenle isleme sokulursa java
		//bunlari yanyana ekler. buna concatenation denir.
		
		String isim="aLi";
		String soyisim ="Can";
		
		System.out.println(isim.concat(soyisim));  //aliCan
		
		System.out.println(isim.concat(" ").concat(soyisim)); // Ali can
		
		System.out.println(""+isim.toUpperCase().charAt(0)+isim.toLowerCase().charAt(1)
				+isim.toLowerCase().charAt(2)); //Ali
		
		System.out.println(isim.toLowerCase(Locale.forLanguageTag("tr"))); //ali
	

	}

}
