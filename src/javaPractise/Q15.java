package javaPractise;
import java.util.Scanner;
public class Q15 {
	public static void main(String[] args) {
		/*Kullanici tarafindan girilen bir sayinin
		 *mutlak degerini yazdirmak icin bir program yazin.
		 */
		Scanner scan = new Scanner(System.in);
    	System.out.print("Mutlak deger almak icin bir sayi giriniz: ");
    	int a = scan.nextInt();
    	
    	if (a<0) {
			System.out.println("Sayinin mutlak degeri: "+Math.abs(a));
		}else {
			System.out.println("Sayinin mutlak degeri: "+a);
		}
		scan.close();
	}
}
