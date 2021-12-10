package tag04;
import java.util.Scanner;
public class scannerToplam {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir sayi giriniz: ");
		int a = scan.nextInt();
		
		System.out.println("bir sayi daha giriniz: ");
		int b= scan.nextInt();
		
		System.out.println("toplam: "+(a+b));
	}
}
