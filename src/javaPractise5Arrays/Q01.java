package javaPractise5Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {
	// kullanicinin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
	// ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasindaki farki gosteren
	// java programi yazin
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
    	System.out.println("dizinin boyutunu giriniz: ");
    	int sayi = scan.nextInt();
    	int[] array = new int[sayi];
    	int count=0;
    	int enBuyuk=0, enKucuk = 1000;
    	while(count<sayi) {
    		System.out.println("Dizinin "+(count+1)+". elemanini giriniz:");
    		int a=scan.nextInt();
    		array[count]=a;
    		count++;
    		
    		/*if (a>enBuyuk) {
				enBuyuk=a;
			}
    		if (a<enKucuk) {
				enKucuk=a;
			}*/
    	
		}
    	Arrays.sort(array);
   
    	System.out.println("Dizinin elemanlari: "+Arrays.toString(array));
    	
    	System.out.println("en buyuk deger ile en kucuk deger arasi fark: "+(array[sayi-1]-array[0]));
    			
    	//System.out.println("dizinin en kucugu: "+enKucuk);
    	//System.out.println("dizinin en buyugu: "+enBuyuk);
    	scan.close();
	}

}
