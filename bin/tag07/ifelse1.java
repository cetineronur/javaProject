package day08;

import java.util.Scanner;

public class ifelse1 {

	public static void main(String[] args) {
		//Soru 2) Kullanicidan bir karakter girmesini isteyin ve 
		//girilen karakterin harf olup olmadigini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir krakter girin");
		char harf = scan.next().charAt(0);
		
		if ((harf>='A' && harf<='Z')||(harf>='a' && harf<='z')) {
			System.out.println("girdiginiz: "+ harf+" bir harftir");
		} else {
			System.out.println("girdiginiz: "+ harf+" bir harf degildir");
		}
		scan.close();
	}

}
