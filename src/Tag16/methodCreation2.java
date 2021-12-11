package Tag16;
import java.util.Scanner;
public class methodCreation2 {
	
		public static void main(String[] args) {
		/*
		 Soru 1 ) Kullanicidan bir sayi alin. 
		 Bu sayinin tek mi cift mi oldugunu, 
		 sifirdan buyuk mu kucuk mu oldugunu, 
		 ayrica ve 100’den buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
		 	100’den kucukse sadece 1’ler basamagini yazdiran 3 method olusturun.
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz: ");
		int sayi= scan.nextInt();
				
		tekMiciftMi(sayi);
		sifirBuyuk(sayi);
		yuzdenBuyukmu(sayi);
		
		scan.close();
	
	}

	private static void yuzdenBuyukmu(int sayi) {
		if (sayi>100) {
		int a=sayi%10;
		int b=(sayi/10)%10;
		int c=sayi/100;
		System.out.println("Girdiginiz sayi yuzden buyuktur. ve basamaklari toplami: "+(a+b+c));
		}else if (sayi<100&&sayi>0) {
			int a= sayi%10;
			System.out.println("Girdiginiz sayi 100'den kucuktur ve birler basamagi: "+a);
		}else {
			int a= sayi%10;
			System.out.println("Gridiginiz sayi negatiftir ve birler basamagi: "+a);
		}
			}

	private static void sifirBuyuk(int sayi) {
		if (sayi>0) {
			System.out.println("Girdiginiz sayi sifirdan buyuktur ");
		}else if(sayi==0) {
			System.out.println("girdiginiz sayi sifirdir.");
		}else {
			System.out.println("Girdiginiz sayi negatiftir.");
		}
		
	}

	private static void tekMiciftMi(int sayi) {
		if (sayi%2==0) {
			System.out.println("Girdiginiz sayi cifttir.");
		}else {
			System.out.println("girdiginiz sayi tektir.");
		}
			}
	
}
