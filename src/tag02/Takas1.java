package tag02;

public class Takas1 {

	public static void main(String[] args) {
		int a=10, b=20;
		System.out.println("Baslangicta sayi1: " + a + " ve Sayi2: " + b);
		int c=a;
		a=b;
		b=c;
		System.out.println("takastan sonra: ");
		System.out.println("Sayi 1: "+a);
		System.out.println("sayi 2: "+b);
	}

}
