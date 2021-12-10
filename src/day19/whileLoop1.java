package day19;

public class whileLoop1 {

	public static void main(String[] args) {
		// 20'den 30'a kadar sayilari 
		// while loop ile yazdirin
		
		for (int i =20; i <=30; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		int sayi=20;
		while(sayi<=30) {
			System.out.print(sayi+" ");
			sayi++;
		}
	}

}
