package Tag10;
import java.util.Scanner;
public class turnary2 {
	public static void main(String[] args) {
		//Soru1 ) Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
		Scanner scan = new Scanner(System.in);
		System.out.println("iki sayi giriniz\n birinci sayidan sonra entera basin");
		int sayi1 = scan.nextInt();
		int sayi2 =scan.nextInt();
		System.out.println((sayi1>sayi2)? "buyuk olmayan sayi:" +sayi2 :(sayi2>sayi1)?("buyuk olmayan sayi:"+sayi1):(""));
	
		if (sayi1>sayi2) {
			System.out.println("buyuk olmayan sayi: "+sayi2);
		}else if (sayi1<sayi2) {
			System.out.println("buyuk olmayan sayi: "+sayi1);
		}else {
			
		}
		scan.close();
	}

}
