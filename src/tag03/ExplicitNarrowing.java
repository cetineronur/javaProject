package Tag03;
import java.util.Scanner;
public class ExplicitNarrowing {
	public static void main(String[] args) {
		int sayi1=256;
		short sayi2=(short)sayi1;
		byte sayi3=(byte) sayi1;
		System.out.println(sayi3);
		double sayi4=87.3;
		int sayi5=(int) sayi4;
		System.out.println(sayi5);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte geben Sie Dezimalzahl ein");
		double sayi = scan.nextDouble();
		int sayi6=(int) sayi;
		System.out.println("Integer zustand: "+sayi6);
		
		int sayi7=(int) (sayi4/sayi6);
		System.out.println(sayi7);
		scan.close();
	}
}

