package tag04;
import java.util.Scanner;
public class dataCasting {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie eine Variable im Integer-Typ ein:  ");
		
		int sayi = scan.nextInt();
		short sayi1 =(short) sayi;
		byte sayi2 = (byte) sayi1;
		
		System.out.println("short: "+sayi1);
		System.out.println("byte : "+sayi2);
		scan.close();
		
		

	}

}
