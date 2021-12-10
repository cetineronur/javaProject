package Tag03;
import java.util.Scanner;
public class Modulus {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie eine vierstellige Zahl ein");
		int Sayi = scan.nextInt();
		int SonRakam= Sayi%10;
		int Gerikalan= Sayi/10;
		int SonRakam1=Gerikalan%10;
		int Gerikalan1=Gerikalan/10;
		int SonRakam2=Gerikalan1%10;
		int SonRakam3=Gerikalan1/10;
		int Sonuc=SonRakam+SonRakam1+SonRakam2+SonRakam3;
		System.out.println("Girdiginiz Sayinin Rakamlari toplami: "+Sonuc);
	}
}
