package javaPractise;

import java.util.Scanner;

public class bankamatik {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//
	System.out.println("***************************");
	System.out.println("ATM'ye hosgeldiniz....");
	String islemler = "1: Bakiye Ogrenme\n2: Para Yatirma\n3: Para Cekme\n4: Cikis";
	System.out.println(islemler);
	System.out.println("***************************");
	
	double bakiye =1000;
	Scanner scan = new Scanner(System.in);
	System.out.println("Lutfen seciminizi yapiniz");
	int islem = scan.nextInt();
	
	switch (islem) {
	
	case 1:
		System.out.println("Bakiyeniz:"+bakiye);
		break;
	case 2: 
		System.out.println("Yatirmak istediginiz tutari giriniz: ");
		double tutar=scan.nextDouble();
		bakiye+=tutar;
		System.out.println("Yeni bakiyeniz: "+bakiye);
		break;
	case 3:
		System.out.println("bakiyeniz: "+bakiye+"\nCekmek istediginiz tutari giriniz: ");
		double tutar1 = scan.nextDouble();
		if (tutar1<=bakiye) {
			bakiye-=tutar1;
			System.out.println("Yeni bakiyeniz: "+bakiye);
		}else if(tutar1>bakiye) {
			System.out.println("Bakiyeniz yetersiz");
		}
		
		break;
	case 4: 
		System.out.println("Cikis yapiliyor... ");
		break;
		default:
			System.out.println("gecersiz islem girdiniz.");
			break;
			
	}
	scan.close();
	
	}
	

}
