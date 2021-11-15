package tag05_mathematischeOperationen;
import java.util.Scanner;
public class ModulusTekrar {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("uc basamakli sayi giriniz");
		int sayi=scan.nextInt();
		
		int basmTop=0;
		int rakam=sayi%10;
		basmTop+=rakam;
		sayi/=10;
		
		rakam=sayi%10;
		basmTop+=rakam;
		sayi/=10;
		
		rakam=sayi%10;
		basmTop+=rakam;
		sayi/=10;
		
		System.out.println("Sayinin rakamlari toplami: "+basmTop);
		scan.close();
	}
}
