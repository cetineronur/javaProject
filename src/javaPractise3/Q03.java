package javaPractise3;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        /*
        Girilen bir stringdeki a harfi sayısını bulunuz.
        ama  c harfine  gelirse döngüden çıkılsın

        Bugün hava oldukca güzel.-> 2
         */
    	Scanner scan =new Scanner(System.in);
    	System.out.println("Bir text giriniz");
    	String str = scan.nextLine();  
    	int count=0;
    	int length=str.length();
    	
    	for (int i = 0; i <length; i++) {
			if (str.toLowerCase().charAt(i)=='a') {
				count++;
			}else if(str.toLowerCase().charAt(i)=='c') {
				break;
			}
		} System.out.println("girdiginiz text deki a sayisi: "+count);
		scan.close();
    }

}
