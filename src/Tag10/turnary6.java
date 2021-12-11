package Tag10;

import java.util.Scanner;

public class turnary6 {

	public static void main(String[] args) {
		//Kullanicidan bir tamsayi alin ve sayi 10’dan kucukse “Rakam” , 100’den kucukse “iki
		//basamakli sayi” degilse “uc basamakli veya daha buyuk sayi” yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tamsayi giriniz");
		int sayi = scan.nextInt();
		
		System.out.println((sayi<10)?"girdiginiz sayi bir rakamdir.":(sayi<100)?"girdiginiz sayi: iki basamaklidir":"girdiginiz sayi: uc basamakli veya daha buyuk bir sayidir.");
		
		if ((sayi<10&&sayi>=0) || (sayi>-10 && sayi<0)) {
			System.out.println("girdiginiz sayi: "+" bir rakamdir.");
		}else  if ((sayi<100 && sayi>9) || (sayi>-100 && sayi<-10)){
			System.out.println("girdiginiz sayi: "+"iki basamaklidir");
		}else {
			System.out.println("girdiginiz sayi: "+"uc basamakli veya uc basamakli negatif bi sayidir");
		}
		scan.close();
	}
}
