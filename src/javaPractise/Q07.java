package javaPractise;
import java.util.Scanner;
public class Q07 {
	public static void main(String[] args) {
		/*
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, 
		 * kucuk harf yada hatali giris seklinde kod yazniz
		 */
		 Scanner scan = new Scanner(System.in);
		 System.out.println("lutfen bir harf giriniz");
		 char harf = scan.next().charAt(0);
		 
		 if (harf>='a' && harf<='z') {
			System.out.println("kucuk harf girdiniz");
		}else if(harf>='A' && harf<='Z') {
			System.out.println("Buyuk harf girdiniz");
		}else {
			System.out.println("hatali giris yaptiniz");
		}	
		 scan.close();
	}
}
