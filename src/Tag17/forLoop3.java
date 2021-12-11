package Tag17;
import java.util.Scanner;
public class forLoop3 {
	public static void main(String[] args) {
		//Kullanicidan 100’den kucuk bir tamsayi isteyin. 
		//1’den baslayarak girilen sayiya kadar
		//3’un kati olan sayilari yazdirin.
		Scanner scan = new Scanner(System.in);
		System.out.println("100'den kucuk bir tam sayi giriniz");
		double nummer= scan.nextInt();
		int nummer1=(int) nummer;
		if (nummer1<0) {
			System.out.println("negatif sayi giremezsiniz");
		}else if(nummer1<100) {
		
		for (int i = 1; i<=nummer1;i++) {
			if (i%3==0) {
				System.out.print(i+ " ");
			}
		}
			
		}
		scan.close();
	}

}
