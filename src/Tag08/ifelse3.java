package Tag08;
import java.util.Scanner;
class ifelse3 {
	public static void main(String[] args) {
		//kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise 
		//sayilarin toplamini yazdirin, sayilarin ikisi de negative ise 
		//sayilarin carpimini yazdirin, sayilarin ikisi farkli isaretlere 
		//sahipse “farkli isaretlerde sayilarla islem yapamazsin” yazdirin, 
		//sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir” 
		//yazdir
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen iki sayi girin \nilksayidan sonra diger sayiyi girin");
		double sayi1=scan.nextDouble();
		//System.out.println("2. sayiyi girin");
		double sayi2=scan.nextDouble();
		
		if (sayi1>0 && sayi2>0) {
			System.out.println("sayilarin toplami: "+(sayi1+sayi2));
		} else if(sayi1<0 && sayi2<0){
			System.out.println("sayilarin carpimi: "+sayi1*sayi2);
		} else if (sayi1*sayi2<0) {
			System.out.println("farkli isaretlerde sayilarla islem yapamazsin");
		} else {
			System.out.println("sifir carpmaya gore yutan elemandir.");
		}
		scan.close();
	}

}
