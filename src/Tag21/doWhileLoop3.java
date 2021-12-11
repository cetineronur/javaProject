package Tag21;

import java.util.Scanner;

public class doWhileLoop3 {

	public static void main(String[] args) {
		/*Bitten Sie den Benutzer, positive Zahlen zu summieren,
	Sagen Sie ihm, dass er 0 drücken soll, um den Vorgang abzuschließen.
	Wenn der Benutzer versehentlich eine negative Zahl eingibt, wird
	ignoriere es und drucke "Sie können keine negativen Zahlen eingeben" 
	und kehren zum Anfang zurück
	Wenn der Benutzer 0 drückt, wie viele positive Zahlen insgesamt eingegeben werden,
	wie viele negative Zahlen Sie versehentlich eingegeben haben und
	Drucken Sie die Summe der Zahlen.*/
		
		int sayi=1, pToplam=0, nCount=0, pCount=0;
		Scanner scan=new Scanner(System.in);
		do {
			
			System.out.println("Lutfen toplamak icin pozitif sayilar girin:\nardindan entera basin\ncikmak icin 0'a basin");
			sayi=scan.nextInt();
			if (sayi>0) {
				pToplam+=sayi;
				pCount++;
			}else if(sayi<0) {
				System.out.println("negatif sayi giremezsiniz");
				nCount++;
				System.out.println("Lutfen toplamak icin pozitif sayilar girin:\n ardindan entera basin\ncikmak icin 0'a basin");
				sayi=scan.nextInt();
				pToplam+=sayi;
				pCount++;
			}else 
				System.out.println("uygulamadan ciktiniz\n toplam "+pCount+" pozitif sayi girdiniz ve toplam "+nCount+" toplam negatif sayi girdiniz ve poziif sayilarin toplami: "+pToplam);
								
		} while (sayi>1);
		scan.close();

	}

}
