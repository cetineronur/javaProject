package javaPractise1;
import java.util.Scanner;
public class Q01 {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
        // Kullanıcıdan alacağınız bir stringin bos olup olmadığını kontrol ediniz.
       Scanner scan = new Scanner(System.in);
       System.out.println("Bir string giriniz");
       String cumle = scan.next();
       
       System.out.println("Bosluk krakteri var mi :"+cumle.contains(" "));
       System.out.println("string bos mu? :"+cumle.isEmpty());
       scan.close();
    }
}

