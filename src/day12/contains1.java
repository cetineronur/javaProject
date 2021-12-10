package day12;
import java.util.Scanner;
public class contains1 {
	public static void main(String[] args) {
		/*Kullanicidan bir cumle isteyin. Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak, 
		“kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin, 
		iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir cumle giriniz");
		String cumle = scan.nextLine();
		
		if (cumle.contains("buyuk")) {
			System.out.println(cumle.toUpperCase());
		}else if (cumle.contains("kucuk")) {
			System.out.println(cumle.toLowerCase());
		}else {
			System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");
		}
	scan.close();
	}

}
