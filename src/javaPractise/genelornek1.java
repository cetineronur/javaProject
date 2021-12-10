package javaPractise;

public class genelornek1 {

	public static void main(String[] args) {
		int a=12345;
		int sonhane=a%10;
		int soniki=(a/10)%10;
		int sonuc=(a/100)%10;
		int sondort=(a/1000)%10;
		int sonbes=(a/10000);
		System.out.println(sonhane);
		System.out.println(soniki);
		System.out.println(sonuc);
		System.out.println(sondort);
		System.out.println(sonbes);
		System.out.println(sonbes+"\n"+sondort+"\n"+sonuc+"\n"+soniki+"\n"+sonhane);
		
		int sayi=12345;
		int rakam=sayi%10;
		System.out.println(rakam);
		sayi/=10;
		rakam=sayi%10;
		System.out.println(rakam);
		sayi/=10;
		rakam=sayi%10;
		System.out.println(rakam);
		sayi/=10;
		rakam=sayi%10;
		System.out.println(rakam);
		sayi/=10;
		rakam=sayi%10;
		System.out.println(rakam);
	}

}
