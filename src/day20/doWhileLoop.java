package day20;

public class doWhileLoop {

	public static void main(String[] args) {
		// while loop once kontrol eder sonra kodu calistirir.
		// loop icinde artis yapilsa da bir sonraki kontrole kadar kod calismaya devam eder.
		
		//do while loop ise once islemi yapar ve sonra sarti kontrol eder.
		//ozellikle kullanicidan deger almada tercih edilir.
		
		int a=0;
		do {
			System.out.print(a+" ");
			a++;
		}while(a<5);
		
		System.out.println();
		
		int b=0;
		while (b<5) {
			System.out.println(b+" ");
			b++;
		}
	}

}
