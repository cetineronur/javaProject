package day17;

import java.util.Scanner;

public class forLoop5 {

	public static void main(String[] args) {
		/*Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak
		girilen sayiya kadar tum sayilari yazdirin. Ancak;
		- Sayi 3’un kati ise sayi yerine “Java” yazdirin.
		- Sayi 5’in kati ise sayi yerine “Guzeldir” yazdirin.
		- Sayi hem 3’un hem 5’in kati ise sayi yerine “Java Guzeldir” yazdirin.*/
		Scanner scan = new Scanner(System.in);
		System.out.println("100'den kucuk bir tam sayi giriniz");
		int nummer= scan.nextInt();
		
		for (int i = 1; i<=nummer; i++) {
			if (i%3==0 && i%5==0) {
				System.out.println("java guzeldir");
			}else if(i%5==0) {
				System.out.println("guzeldir");
		}else if(i%3==0) {
			System.out.println("java");
		}else {
			System.out.println(i);
		}
		
		}
		scan.close();
	}

}
