package tag24;

import java.util.ArrayList;
import java.util.List;

public class arrayList {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> isimList  = new ArrayList<>();
		List<String> isimList2 = new ArrayList<String>();
		
		List <Integer> sayilar = new ArrayList<>();
		List <Boolean> cevaplar = new ArrayList<>();
		
		List<String> isimler = new ArrayList<>();
		System.out.println("Bos liste : "+isimler);
		
		isimler.add("Ali");
		System.out.println("Bir elemanli : "+isimler);
		
		isimler.add("Veli");
		System.out.println("iki elemanli : "+isimler);// add methodu listenin sonuna ekleme yapar.
		
		isimler.add(1,"Ayse"); // 1.indexe Ayse ekledik
		System.out.println(isimler);
		
		//isimler.add(5);//String arrayliste integer ekleyemeyiz.
		List<String> liste2 = new ArrayList<>();
		
		liste2.add("Gunter");
		liste2.add("Emrah");
		System.out.println("Liste 2 : "+liste2);
		
		isimler.addAll(liste2);
		System.out.println(isimler);//liste2 yi sona ekledik
		
		isimler.addAll(5,liste2);
		System.out.println(isimler);// liste2 yi 5.indexden itibaren sonra ekledi
		
		
	}

}
