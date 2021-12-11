package Tag17;
import java.util.Scanner;
public class forLoop9 {
	public static void main(String[] args) {
		//Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari
		//toplayip, sonucu yazdiran bir program yaziniz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayi giriniz");
		int nummer1= scan.nextInt();
		System.out.println("bir sayi daha giriniz");
		int nummer2= scan.nextInt();
		
		
		if (nummer1>nummer2) {
			int toplam1=0;
			for (int i=nummer2; i<nummer1; i++) {
		toplam1+=i;		
		}
			System.out.println("Girdiginiz sayilarin arasi toplami: "+toplam1);
		}else {
			
			for (int i=nummer1; i<nummer2; i++) {
		int toplam2+=i;
			
		}
			System.out.println("Girdiginiz sayilarin arasi toplami: "+toplam1);
		}
		scan.close();
	}
}
