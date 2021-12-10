package javaPractise;
import java.util.Scanner;
public class switchCase3 {
    public static void main(String[] args) {

// Girilen bir ay numarasına göre , 
 //ayın kaç gün olduğunu sayı ile yazdırınız

    	Scanner scan = new Scanner(System.in);
    	System.out.println("Bir ay numarasi giriniz");
    	int sayi = scan.nextInt();
    	if (sayi==1||sayi==3||sayi==5||sayi==7||sayi==8||sayi==10||sayi==12) {
    		switch (sayi) {
    		case 1:
    		System.out.println("bu ay 31 gundur.");
    		break;
    		case 3:
    		System.out.println("bu ay 31 gundur.");
        	break;	
    		case 5:
    			System.out.println("bu ay 31 gundur.");
        		break;
    		case 7:
    			System.out.println("bu ay 31 gundur.");
        		break;
    		case 8:
    			System.out.println("bu ay 31 gundur.");
        		break;
    		case 10:
    			System.out.println("bu ay 31 gundur.");
        		break;
    		case 12:
    			System.out.println("bu ay 31 gundur.");
        		break;
    		}
		}else {
			switch (sayi) {
			case 2:
				System.out.println("bu ay 30 gundur");
				break;
			case 4:
				System.out.println("bu ay 30 gundur");
				break;
			case 6:
				System.out.println("bu ay 30 gundur");
				break;
			case 9:
				System.out.println("bu ay 30 gundur");
				break;
			case 11:
				System.out.println("bu ay 30 gundur");
				break;
				default:
					System.out.println("yanlis giris yaptiniz.");
					scan.close();
			}
		}
    	 
       
    }
}

