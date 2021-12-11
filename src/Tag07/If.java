package Tag07;
import java.util.Scanner;
public class If {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("gun isimlerinden birinin ilk harfini yaz: ");
		char ilkharf = scan.next().toUpperCase().charAt(0);
		//kullanicinin girdigi verinin tamamini kucuk yada buyuk yapabiliriz.
		//toUppercase kelimeyi buyultur.charAt ilk harfi alir.
		if (ilkharf=='P') {
			System.out.println("Pazar, Pazartesi veya Persembe");
		}
		if (ilkharf=='S') {
			System.out.println("Sali");
		}
		if (ilkharf=='C') {
			System.out.println("Carsamba, Cuma veya Cumartesi");
		}
		if (ilkharf!='C' && ilkharf!='P' && ilkharf!='S') {
			System.out.println("gecersiz harf girdiniz. lutfen gun isimlerinin birinin basharfini giriniz.");
		}
	}
}
