package day08;
import java.util.Scanner;
public class ifElseIf4 {
	public static void main(String[] args) {
		//Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap azdirin.
		// Teklif 80.000’in uzerinde ise “Kabul ediyorum” ,
		// 60 – 80.000 arasinda ise “Konusabiliriz”,
		// 60.000’nin altinda ise “Maalesef Kabul edemem” yazdirin
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen teklif girin");
		double geld=scan.nextDouble();
		if (geld>80000) {
			System.out.println("kabul ediyorum.");
		} else if(geld>60000){
			System.out.println("konusabiliriz");
		} else {
			System.out.println("maaalesef kabul etmiyorum.");
		}
		scan.close();
	}
}
