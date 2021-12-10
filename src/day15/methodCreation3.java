package day15;
import java.util.Scanner;
public class methodCreation3 {
	public static void main(String[] args) {
		//Bir string’te herhangi bir karakteri silecek bir method yaz.
		
		 losen();
    }
    private static void losen() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz.");
        String cumle = scan.nextLine();
        System.out.println("kacinci karakteri silmek istiyorsunz.?");
        int kacinci = scan.nextInt();
        int length=cumle.length();
        if (kacinci<length&&kacinci>0) {
        
            cumle=cumle.replaceFirst(cumle.substring(kacinci-1, kacinci), "");
            System.out.println(cumle);
        
        }else {
            System.out.println("cumle "+ (length-1) + " krakterden olusmaktadir lutfen 0 ile "+(length-1)+ " arasinda rakam giriniz");
        }scan.close();
        }
}