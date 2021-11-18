package day07;
import java.util.Scanner;
public class ekrandanGirilenOnSayiyiTersCeviripToplar {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("uc basamakli 1. sayiyi giriniz: ");
		int sayi = scan.nextInt();
		System.out.print("uc basamakli 2.sayiyi giriniz: ");
		int sayi1 = scan.nextInt();
		int a=sayi%10; // 123 sayisinin son hanesini bulduk.
		sayi/=10;      // 10'a bolerek sayiyi iki haneye dusurduk.   
		int b=sayi%10; // iki haneli sayinin son hanesini bulduk.
		sayi/=10;	   // tekrar iki haneli sayinin ilk rakamini bulduk.
		int c=sayi;   // ilk rakami da c'ye atadik.
		System.out.println("Girdiginiz 1.sayinin tersi: "+a+b+c);
		
		int a1=sayi1%10; // ornegin 123 sayisinin son hanesini bulduk.
		sayi1/=10;      // 10'a bolerek sayiyi iki haneye dusurduk.   
		int b1=sayi1%10; // iki haneli sayinin son hanesini bulduk.
		sayi1/=10;	   // tekrar iki haneli sayinin ilk rakamini bulduk.
		int c1=sayi1;   // ilk rakami da c'ye atadik.
		System.out.println("Girdiginiz 2.sayinin tersi: "+a1+b1+c1);
	
	}

}
