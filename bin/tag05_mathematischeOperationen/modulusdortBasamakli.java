package tag05_mathematischeOperationen;

import java.util.Scanner;

public class modulusdortBasamakli {

	public static void main(String[] args) {
		// kullanicidan 4 basamakli bir sayi alip rkamlarini toplayan
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen 4  basamkli bir sayi yaziniz");
		int a=scan.nextInt();
		int rakamtop=0;
		int rakam=a%10;
		rakamtop+=rakam;
		a/=10;
		
		rakam=a%10;
		rakamtop+=rakam;
		a/=10;
		
		rakam=a%10;
		rakamtop+=rakam;
		a/=10;
		
		rakam=a%10;
		rakamtop+=rakam;
		a/=10;
		System.out.println("girdiginiz sayinin rakamlar toplami: "+rakamtop);
		scan.close();

	}

}
