package javaPractise4WhileDoLoop;

import java.util.Scanner;

public class musteriKarti {

	public static void main(String[] args) {
		/*Kullanıcıdan aldığı ürünün adedini ve liste fiyatını alin, kullanıcıya
		 -müşteri kartı olup olmadığını sorun,
		 -Müşteri kartı varsa ve 10 üründen fazla alırsa %20, yoksa %15 indirim 
		yapın. 
		 -Müşteri kartı yoksa ve 10 üründen fazla alırsa %15, 10 üründen az alırsa 
		%10 indirim yapın. */
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Lutfen aldiginiz urun adededini giriniz: ");
		int adet=scan.nextInt();
		System.out.println("Lutfen liste fiyatini girin: ");
		double fiyat = scan.nextDouble();
		System.out.println("Musteri kartiniz var mi? Evet ise E, Hayir ise H yazin");
		char kart = scan.next().toUpperCase().charAt(0);
	
		if (kart=='E'||kart=='H') {
	
		if (kart=='E') {
			if (adet>10) {
				System.out.println("Odeyeceginiz ucret %20 inidirimli olarak: "+((adet*fiyat)*0.80));
			}else {
				System.out.println("Odeyeceginiz ucret %15 inidirimli olarak: "+((adet*fiyat)*0.85));
			}
		}
		if(kart=='H') {
			if (adet>10) {
				System.out.println("Odeyeceginiz ucret %20 inidirimli olarak: "+((adet*fiyat)*0.85));
			}else {
				System.out.println("Odeyeceginiz ucret %15 inidirimli olarak: "+((adet*fiyat)*0.90));
			}
		}
		
		}else {
			System.out.println("Lutfen Evet yada hayir yaziniz.");
		}
	}

}
