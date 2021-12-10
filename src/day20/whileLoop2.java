package day20;
import java.util.Scanner;
public class whileLoop2 {
	public static void main(String[] args) {
		/*Kullanicidan bir sayi alin ve 
		bu sayiyi tam bolen sayilari ve toplam kac tane
		olduklarini ekranda yazdirin*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bolenlerini bulmak icin bir sayi giriniz: ");
		int a = scan.nextInt();
		int sayac=0;
		int bolen=1;
		
		while (a>=bolen) {
			if (a%bolen==0) {
				System.out.print(bolen+", ");
				sayac++;
				bolen++;
			}else if(a%bolen!=0) {
				bolen++;
			}
		}System.out.println("toplam "+sayac+" boleni vardir.");
		scan.close();
	}
}
