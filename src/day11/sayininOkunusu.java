package day11;
import java.util.Scanner;
public class sayininOkunusu {
	public static void main(String[] args) {
		/*
         * SORU 2
         * Kullanicidan 3 basamakli bir sayi alip sayinin okunusunu yazdirin
         * Input : 356 Output : Ucyuzellialti
         */
		Scanner scan = new Scanner(System.in);
		System.out.println("3 basamakli bir sayi giriniz:");
		int sayi = scan.nextInt();
		int birler=sayi%10, onlar=(sayi/10)%10, yuzler=(sayi/100);
		switch (yuzler) {
		case 0:
			System.out.print("");
			break;
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
			}
		switch (onlar) {
	
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
			System.out.print("doksan");
			break;
			default:
			}
		switch (birler) {
		
		case 1: 
			System.out.print("bir ");
			break;
		case 2: 
			System.out.print("iki ");
			break;
		case 3: 
			System.out.print("uc ");
			break;
		case 4: 
			System.out.print("dort ");
			break;
		case 5: 
			System.out.print("bes ");
			break;
		case 6: 
			System.out.print("alti ");
			break;
		case 7: 
			System.out.print("yedi ");
			break;
		case 8: 
			System.out.print("sekiz ");
			break;
		case 9: 
			System.out.print("dokuz");
			break;
			default:
			}

	}

}
