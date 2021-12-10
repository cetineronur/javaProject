package day10;
import java.util.Scanner;
public class turnary8 {
	public static void main(String[] args) {
		//Kullanicidan dikdortgenin uzunlugunu ve genisligini alin, girilen degerlere
		//gore dikdorgenin kare olup olmadigini yazdirin.
		Scanner scan = new Scanner(System.in);
		System.out.println("dikdortgenin kenarlarini giriniz \n herbirinden sonra entera basiniz");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
	
		System.out.println((sayi1>0&&sayi2>0)&&(sayi1==sayi2)?"bu bir karedir":(sayi1>0&&sayi2>0)&&(sayi1>sayi2 || sayi2>sayi1)? "bu bir dikdortgendir.":"Lutfen pozitif bir rakam girin");
		if (sayi1>0 && sayi2>0) {
			if (sayi1==sayi2) {
				System.out.println("bu bir karedir");
			}else if(sayi1>sayi2 || sayi2>sayi1) {
				System.out.println("bu bir dikdortgendir");
			}
		}else {
			System.out.println("Lutfen pozitif bir rakam girin");
		}
		scan.close();
	}

}
