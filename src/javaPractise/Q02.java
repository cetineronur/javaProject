package javaPractise;
import java.util.Scanner;
public class Q02 {
	public static void main(String[] args) {
	/*Kullanicidan 3 tene pozitif  tam sayi alniz. 
	 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
	     üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
		 a+b>c>a-b
		 a+c>b>a-c  
	     b+c>a>b-c  
		a=b=c ise es kenar ucgen  
	 */
		Scanner scan = new Scanner(System.in);
		System.out.println("uc tane kenar giriniz\n herbirinden sonra entera basiniz");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
	if (((a+b)>c&&c>(a-b))||((a+c)>b&&b>(a-c))||((b+c)>a && a>(b-c))){
		if ((a!=b)&&(b!=c)&&(c!=a)) {
		System.out.println("cesitkenar ucgen olabilir");
		}else if (a==b && b==c) {
		System.out.println("Eskenar ucgendir.");
	}
		}else {
			System.out.println("girdiginiz rakamlar ucgen olusturmuyor.");
		}
		scan.close();
	}}
