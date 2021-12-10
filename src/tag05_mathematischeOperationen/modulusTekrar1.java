package tag05_mathematischeOperationen;
import java.util.Scanner;
public class modulusTekrar1 {
public static void main (String []args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("dort basamakli sayi giriniz: ");
	int sayi=scan.nextInt();
	int sonbasamak=(sayi%10);
	int ikincibasamak=(sayi/10)%10;
	int ucuncurakam=(sayi/100)%10;
	int dorduncurakam=(sayi/1000);
	int a=(sonbasamak+ikincibasamak+ucuncurakam+dorduncurakam);
	
	boolean a1=a%3==0;
	System.out.println("3'e bolunme durumu: "+a1);
	
	boolean sayi1=sayi%10==5 || sayi%10==0;
	System.out.println("5'e bolunme durumu: "+sayi1);
	System.out.println(sayi+" sayisinin 3 ile bolumundan kalan: "+sayi%3);
	System.out.println(sayi+" sayisinin 5 ile bolumundan kalan: "+sayi%5);
    scan.close();
}
}
