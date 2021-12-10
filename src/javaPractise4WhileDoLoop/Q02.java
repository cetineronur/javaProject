package javaPractise4WhileDoLoop;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		// indexi tek sayi olan karakterleri yazdiran bir code create ediniz

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz: ");
		String cumle = scan.nextLine();
		int index=0;
		
		while(cumle.length()>index) {
			if (index%2!=0) {
				System.out.print(cumle.substring(index, index+1)+" ");
			}
			
			index++;
		}
		scan.close();
	}

}
