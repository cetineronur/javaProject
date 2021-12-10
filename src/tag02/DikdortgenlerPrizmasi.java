package tag02;
import java.util.Scanner;

public class DikdortgenlerPrizmasi {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Dikdortgenler Prizmasinin Uzun Kenarini girinz");
		int Ukenar =scan.nextInt();
		System.out.println("Dikdortgenler Prizmasinin Kisa Kenarini girinz");
		int Kkenar =scan.nextInt();
		System.out.println("Dikdortgenler Prizmasinin Yuksekligini girinz");
		int Yukseklik =scan.nextInt();
		
		System.out.println("Prizmanin Hacmi: " + (Ukenar*Kkenar*Yukseklik));
		
		
	}

}
