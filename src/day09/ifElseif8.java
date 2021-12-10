package day09;

import java.util.Scanner;

public class ifElseif8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("uc sayi yaziniz \n herbirinden sonra entera basiniz");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		double sayi3=scan.nextDouble();
		
		if ((sayi1>sayi2) && sayi1>sayi3) {
			System.out.println("Enbuyuk sayi: "+sayi1+"'dir");
		} else if ((sayi2>sayi1) && (sayi2>sayi3)){
			System.out.println("En buyuk sayi: "+sayi2+"'dir");
		}else {
			System.out.println("en buyuk sayi: "+sayi3+"'dir");
		}
	}

}
