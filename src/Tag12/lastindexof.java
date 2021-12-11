package Tag12;

import java.util.Scanner;

public class lastindexof {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir cumle giriniz: ");
		
		String cumle = scan.nextLine();
		System.out.println("Lutfen varligini kontrol etmek icin bir harf giriniz");
		
		char krk = scan.next().charAt(0);
		
		int index=cumle.lastIndexOf(krk);
		
		if (index==-1) {
			System.out.println("harf Cumlede kullanilmamis ");
		}else {
			System.out.println("harf cumlede kullanilmis");
		}
		scan.close();
	}

}
