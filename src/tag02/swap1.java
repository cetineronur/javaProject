package tag02;

public class swap1 {

	public static void main(String[] args) {
		int sayi1=10,sayi2=450;
		System.out.println("swaptan once: ");
		System.out.println("sayi1: "+sayi1);
		System.out.println("sayi2: "+sayi2);
		
		System.out.println("swaptan sonra: ");
		sayi1=sayi1+sayi2;
		sayi2=sayi1-sayi2;
		sayi1=sayi1-sayi2;
		System.out.println("sayi1: "+sayi1);
		System.out.println("sayi2: "+sayi2);
	}

}
