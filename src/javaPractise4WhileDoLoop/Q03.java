package javaPractise4WhileDoLoop;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
        // Kullanicidan 2 sayi alaliniz.
        //1. sayi taban
        //2. sayi Ust
        //1 sayinin ussunu hesaplatan code create edinim.
        // 3, 3  sonuc = 27

        //2  3 = 2*2*2=8

    	Scanner scan =new Scanner(System.in);
		System.out.println("bir sayi giriniz:\n2.sayidan sonra entera basin");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		int us=1;
		while(sayi2>0) {
		us*=sayi1;
		--sayi2;	
		}
		System.out.println(us);
		scan.close();
    }

}
