package Tag10;
import java.util.Scanner;
public class turnary1 {
	public static void main(String[] args) {
		// Kullanicidan bir sayi alin ve sayi 3 basamakli ise"uc basamakli sayi"
				//yoksa uc basamakli degil yazdirin
		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayi girin: ");
		int sayi = scan.nextInt();
		System.out.println((sayi>100 && sayi<999)? ("sayi uc basamaklidir") :(sayi<0&&sayi!=0)?("sayi negatiftir"):("sayi 0 ile 99 arasindadir"));
		if (sayi<1000) {
			System.out.println("sayi uc basamaklidir.");
		}else {
			System.out.println("sayi uc basamakli degildir");
		}
	}
}
