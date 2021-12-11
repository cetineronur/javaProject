package Tag09;
import java.util.Scanner;
public class ifElseIf6 {
public static void main(String[] args) {
	// Kullanicidan bir sayi alin 	
	// Girilen sayı hem 2 ile hem de 3 ile tam bölünebiliyorsa “2 ve 3’ün katı”,
	//sadece 2 ile bölünebiliyorsa “2’nin katı”,
	//sadece 3 ile bölünebiliyorsa “3’ün katı”,
	//ne 2’ye ne de 3’e bölünmüyorsa “2 veya 3’ün katı değil” mesajı veren program yazin

	Scanner scan = new Scanner(System.in);
	System.out.println("Bir sayi giriniz: ");
	int sayi = scan.nextInt();
	
	if (sayi%2==0 && sayi%3==0) {
		System.out.println("sayi 2 ve 3'un katidir.");
	} else if (sayi%2==0){
		System.out.println("sayi 2'nin katidir.");
	}else if(sayi%3==0) {
		System.out.println("sayi 3'un katidir");
	}else {
		System.out.println("2 veya 3’ün katı değildir");
	}
	scan.close();
}

}
