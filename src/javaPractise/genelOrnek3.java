package javaPractise;
import java.util.Scanner;
public class genelOrnek3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Ad-Soyadi giriniz:");
		String ad=scan.nextLine();
		
		System.out.print("Boyunuzu giriniz:");
		double boy=scan.nextDouble();
		
		System.out.print("yasinizi giriniz:");
		byte yas=scan.nextByte();
		
		System.out.print("Kilonuzu giriniz:");
		byte kilo=scan.nextByte();
		
		System.out.print("\n"+"Benim adim ve soyadim: "+ad+"\n"
		+"Boyum: "+boy+" cm"+"\n"
		+"Yasim: "+yas+"\n"
		+"Kilom: "+kilo+" kg");
		 scan.close();
	}

}
