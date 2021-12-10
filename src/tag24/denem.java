package tag24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class denem {

	public static void main(String[] args) {
		//Kullanicidan girmesini istedigi sayi miktarini alalim. Mesela kullanici 5 girdi.
        //Ekrana bu girilen sayilari tek olanlarini yazdiralim. Mesela 
        
		Scanner scan = new Scanner(System.in);
		System.out.println("kac sayi girmek istiyorsunuz: ");
		int sayi = scan.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		int sayi1=0;
		
		for (int i = 0; i <sayi; i++) {
			System.out.println(i+1+". sayiyi giriniz: ");
			sayi1=scan.nextInt();
			list.add(sayi1);
			if (sayi1%2==1) {
				list1.add(sayi1);
			}else if(scan.nextInt()%2==0) {
				list2.add(sayi1);
			}
		}System.out.println(list);
		System.out.println(list1);
		System.out.println(list2);
		
		
	}

}
