package Tag07;
import java.util.Scanner;
public class basitIf {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen dikdortgenin bir kenar uzunlugunu girin");
		double kenar1=scan.nextDouble();
		System.out.println("lutfen dikdortgenin diger kenar uzunlugunu girin");
		double kenar2=scan.nextDouble();
		
		if (kenar1!=kenar2) {
			System.out.println("girilen dikdortgen");
		}
		if (kenar1==kenar2) {
			System.out.println("girilen kare");
		}
	}
}
