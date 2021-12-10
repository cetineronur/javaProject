package day19;

import java.util.Scanner;

public class whileLoop5 {

	public static void main(String[] args) {
		// Kullanicidan baslangic ve bitis degerlerini alin. 
		//Baslangic degeri ve bitis degeri
		//dahil aralarindaki tum cift tamsayilari 
		//while loop kullanarak ekrana yazdiriniz.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("baslangic ve bitis degerlerini girin\n entera basin");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		while (a>b) {
			if(b%2==0) {
				System.out.println(b+" ");
			b+=2;
			}else {
				System.out.println("");
			b++;
			}
			if (a==b) {
				System.out.println("");
			}
		}
		while (b>a) {
			if(a%2==0) {
				System.out.println(a+" ");
			a+=2;
			}else {
				System.out.println("");
			a++;
			}
			if (a==b) {
				System.out.println(a);
			}
		}
	scan.close();
	}

}
