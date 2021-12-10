package javaPractise;
import java.util.Scanner;
public class Ter03 {
    public static void main(String[] args) {
        // Kullanıcıdan bir pozitif tamsayı girmesini isteyin, 
    	// o pozitif tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
        // 3 basamaklı degilse çift olup olmadigini kontrol edin. 
    	// Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
        // Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”
    	Scanner scan = new Scanner(System.in);
		 System.out.println("Pozitif bir tamsayi giriniz");
		 int sayi = scan.nextInt(); 
		 
		 System.out.println("*****ternary cozumu*****");
		 System.out.println((sayi>99&&sayi<1000)?"girilen sayi uc basamaklidir":(sayi>999||(sayi<100&&sayi>0))?(sayi%2==0)?"uc basmakli olmayan cift sayi.":"uc basamakli olmayan tek sayi.":((sayi<=0)?"negatif sayi girdiniz":""));
		 
		 System.out.println("*****if cozumu*****");
		  if (sayi>99&&sayi<1000) {
			 System.out.println("girilen sayi uc basamaklidir");
		}else if(sayi>999||(sayi<100&&sayi>0)) {
			if (sayi%2==0) {
			System.out.println("uc basmakli olmayan cift sayi.");
		}else {
			System.out.println("3 basamaklı olmayan tek sayı.");
		}}else if (sayi<=0) {
				System.out.println("negatif sayi girdiniz");
			}
		  scan.close();
      
    }
}