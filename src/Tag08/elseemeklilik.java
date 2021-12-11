package Tag08;

import java.util.Scanner;

public class elseemeklilik {

	public static void main(String[] args) {
		//Soru 3) Kullaniciya yasini sorun, 
		//eger yas 65’den kucuk ise “emekli olamazsin, calismalisin”,
	    // 65’den buyukse “Emekli olabilirsin” yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen yasinizi girin");
		int yas=scan.nextInt();
		
		if (yas<65) {
			System.out.println("emekli olamazsin, calismalisin");
		} else {
			System.out.println("emekli olabilirsin");
		}
		scan.close();
	}
}
