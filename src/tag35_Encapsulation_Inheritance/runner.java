package tag35_Encapsulation_Inheritance;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class runner {

	public static void main(String[] args) {
		/*1- Ogrenci isminde bir class create ediniz. 
		 * fields (encapsuleted) -> numarasi, adi, soyadi, ortalama olmali.
		 *2- Tum fields'lar için constructor create ediniz. fields
   		  3- Bir main class'ta Kullaniciya ögr kaydi, ogrc listeleme, 
   		  ogrc kayit silme islemlerini yaptiriniz.*/
	
		Ogrenci obj = new Ogrenci();
		
		Scanner scan= new Scanner(System.in);
		System.out.println("hangi ogrenciyi eklemek isiyoprsunuz?");
		String isim=scan.next();
		//obj.setIsim(isim, isim);
		System.out.println("hangi ogrenciyi silmek istiyorsunuz");
		String isim1=scan.next();
		int a=0;
		for (int i = 0; i <obj.getIsim().size(); i++) {
			if (obj.getIsim().get(i).contains(isim1)) {
				a=obj.getIsim().indexOf(isim1);
			}
		}
		obj.setIsim(isim, a);
		System.out.println(obj.getIsim());
		
	}

}
