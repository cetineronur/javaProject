package day14;

import java.util.Scanner;

public class replaceFirst {

	public static void main(String[] args) {
		/*Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa “Sifre
		basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir
		sifre girin” yazdirin
		- Ilk harf buyuk harf olmali
		- Son harf kucuk harf olmali
		- Sifre bosluk icermemeli
		- Sifre uzunlugu en az 8 karakter olmali
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sifre giriniz: ");
		String password = scan.nextLine();
		int index = password.length();
		char erstebuschtaben=password.charAt(0);
		char letztebuschtaben=password.charAt(index-1);
		
		if ((erstebuschtaben>=65 && erstebuschtaben<=90)&&(letztebuschtaben>=97&&letztebuschtaben<=122)&&(!password.contains(" "))&&(index>=8)) {
			System.out.println("Sifre basari ile tanimlandin");
		}else {
			System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");
		}
		scan.close();
		
	}

}
