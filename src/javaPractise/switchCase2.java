package javaPractise;
import java.util.Scanner;
public class switchCase2 {
    public static void main(String[] args) {
    	// 2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız
    	Scanner scan = new Scanner(System.in);
    	System.out.println("uc basamakli bir sayi giriniz");
    	int sayi = scan.nextInt();
    	
    	int c=sayi%10;
        int b=(sayi/10)%10;
        int a=(sayi/100);
       
        switch (a) {
        case 1: 
        	System.out.print("yuz ");
        	break;
        case 2: 
        	System.out.print("iki yuz ");
        	break;
        case 3: 
            System.out.print("uc yuz ");
            break;
        case 4: 
            System.out.print("dort yuz ");
            break;
        case 5: 
            System.out.print("bes yuz ");
            break;
         case 6: 
            System.out.print("alti yuz ");
            break;
         case 7: 
            System.out.print("yedi yuz ");
            break;
         case 8: 
            System.out.print("sekiz yuz ");
            break;
         case 9: 
             System.out.print("dokuz yuz ");
             break;
          default:
        	  System.out.print("Girdiginiz sayi uc basamakli degildir.");
                 }
        switch (b) {
        case 0:
        	break;
        case 1: 
        	System.out.print("on ");
        	break;
        case 2: 
        	System.out.print("yirmi ");
        	break;
        case 3: 
            System.out.print("otuz ");
            break;
        case 4: 
            System.out.print("kirk ");
            break;
        case 5: 
            System.out.print("elli ");
            break;
         case 6: 
            System.out.print("altmis ");
            break;
         case 7: 
            System.out.print("yetmis ");
            break;
         case 8: 
            System.out.print("seksen ");
            break;
         case 9: 
             System.out.print("doksan ");
             break;
          default:
        	  System.out.print("lutfen dogru bir rakam giriniz");
                 }
        switch (c) {
        case 0:
        	System.out.println(" ");
        	break;
        case 1: 
        	System.out.println("bir ");
        	break;
        case 2: 
        	System.out.println("iki ");
        	break;
        case 3: 
            System.out.println("uc ");
            break;
        case 4: 
            System.out.println("dort ");
            break;
        case 5: 
            System.out.println("bes ");
            break;
         case 6: 
            System.out.println("alti ");
            break;
         case 7: 
            System.out.println("yedi ");
            break;
         case 8: 
            System.out.println("sekiz ");
            break;
         case 9: 
             System.out.println("dokuz ");
             break;
          default:
        	  System.out.println("lutfen dogru bir rakam giriniz");
                 }
        scan.close();
    }
}
