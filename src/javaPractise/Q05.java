package javaPractise;
import java.util.Scanner;
public class Q05 {
	public static void main(String[] args) {
		// Kullanicidan  yasini ve kilosunu alaliniz
		// 18 yasindan kucuk ise kan bagisi yapamaz
		// 18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		// 18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		Scanner scan = new Scanner(System.in);
    	System.out.print("Yasinizi giriniz: ");
    	int yas = scan.nextInt();
    	System.out.print("kilonuzu kg olarak giriniz: ");
    	double kilo = scan.nextDouble();
    	
    	if (yas<18) {
			System.out.println("kan bagisi yapamaz");
		}else if (yas>18 && kilo<50) {
			System.out.println("kan bagisi yapamaz");
		}else if (yas>18 && kilo>50) {
			System.out.println("kan bagisi yapabilir");
		}else {
			System.out.println("kan bagisi yapamaz");
		}scan.close();
	}}
