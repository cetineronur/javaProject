package day16;

import java.util.Scanner;

public class zamanToSaniye {

	public static void main(String[] args) {
		/*Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun. 
		 * Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.
		1 şeker = 1.7 gr
		Örnek Çıktı:
		Yılda 12.41 kg şeker kullanıyor.*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("gunde kac tane cay iciyorsun");
		int a= scan.nextInt();
		System.out.println("kac tane seker kullaniyorsun");
		int b=scan.nextInt();
		
		double c=1.7;
		System.out.println("yilda "+ (a*b*c*365/1000)+" kg seker kullaniyor.");
		
		scan.close();
	
 	}
}
