package javaPractise;
import java.util.Scanner;
public class switchCase4 {
    public static void main(String[] args) {

        // Bugüne göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        // pazartesi haftanin ilk gunu olarak aliniz..
    	System.out.println("*****************************");
        System.out.println("Girilen gunun 100 gun sonrasini hesaplayan programa Hoşgeldiniz...");

        String islemler = "\n1. : Pazartesi\n2.: Sali\n"
        					+ "3.: Carsamba\n"
        					+ "4.: Persembe\n"
        					+ "5.: Cuma\n"
        					+ "6.: Cumartesi\n"
        					+ "7.: Pazar\n";
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Bugun ne giriniz sayi olarak"+islemler);
    	int sayi = scan.nextInt();
    	
    	switch (sayi) {
    	case 1:
    		System.out.println("Carsamba");
    		break;
    	case 2:
    		System.out.println("Persembe");
    		break;
    	case 3:
    		System.out.println("Cuma");
    		break;
    	case 4:
    		System.out.println("Cumartesi");
    		break;
    	case 5:
    		System.out.println("Pazar");
    		break;
    	case 6:
    		System.out.println("Pazartesi");
    		break;
    	case 7:
    		System.out.println("sali");
    		break;
    		default:
    			System.out.println("yanlis giris yaptiniz.");
    	}
    	scan.close();
    }
}

