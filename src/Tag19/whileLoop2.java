package Tag19;
import java.util.Scanner;
public class whileLoop2 {

	public static void main(String[] args) {
		// kulllanicidan toplanmak uzere sayi isteyin
		//kullanici sifira basincaya kadar sayilari alip
		//toplamay devam edin
		//kullanici sifira bastiginda 
		// o ana kadar sifir haric kac sayi girdigini ve girilen sayilarin toplamini yazdirin.
		
		Scanner scan = new Scanner(System.in);
		int sayi=100;//istedigini koy
		int toplam=0;
		int sayac=0;
		
		while(sayi!=0) {
			System.out.println("lutfen toplama eklemek icin bir tamsayi girin\nbitirmek icin 0'a basin");
			sayi=scan.nextInt();//burada variable atamasi yapmadik. cunku dongude her seferinde atama yapardi.
			toplam+=sayi;
			sayac++;
		}
			System.out.println("girilen sayi adedi: "+(sayac-1));
			System.out.println("girilen sayilarin toplami: "+toplam);
			scan.close();
	}

}
