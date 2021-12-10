package javaPractise2;

import java.util.Scanner;

public class bankamatik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("*** ATM'ye hosgeldiniz ****");
		Scanner scan=new Scanner(System.in);
		String islem="\n 1.islem : BAKIYE \n 2.Islem : PARA CEKME\n 3.islem : PARA YATIRMA\n 4.islem : CIKIS";
		
		System.out.println(islem);
		System.out.println("***********************************");
		System.out.println("yapmak istediginiz islemi seciniz");
		
		int bakiye = 5000;
		
		String wahl=scan.nextLine();
		switch (wahl) {
		case "1":
			System.out.println("Bakiyeniz: "+bakiye);
			break;
		case "2":
			System.out.println("cekeceginiz miktari giriniz: ");
			int cekilen = scan.nextInt();
			if (cekilen<bakiye) {
				bakiye-=cekilen;
				System.out.println("yeni hesap bakiyeniz: "+bakiye);
			}else {
				System.out.println("agam benle eglenir olmayan parayi cekecek.");
			}
			break;
		case "3":
			System.out.println("yatiralacak miktari giriniz: ");
			int yatirilan = scan.nextInt();
			bakiye+=yatirilan;
			System.out.println("yeni hesap bakiyeniz: "+bakiye);
			break;
		case "4":
	System.out.println("cikis isleminiz basari ile yapildi");
			break;


		default:
			break;
		}
		scan.close();
		
	}

}
