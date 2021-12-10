package javaPractise;
import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
    /*
        Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplatan bir kod yazınız
        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)

        Örnek Ekran Çıktısı
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.

        Bu bir dik üçgendir
     */
    	Scanner scan = new Scanner(System.in);
    	System.out.print("Dik ucgenin 1.kenarini giriniz: ");
    	int a = scan.nextInt();
    	System.out.print("Dik ucgenin 2.kenarini giriniz: ");
    	int b = scan.nextInt();
    	System.out.print("Dik ucgenin hipotenusunu giriniz: ");
    	int c = scan.nextInt();

    	if (c==Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2))) {
			System.out.println("yazdiginiz bir dik ucgendir");
		}else {
			System.out.println("lutfen rakamlari degistirip tekrar deneyiniz");
		}
       	scan.close();
    }
}
