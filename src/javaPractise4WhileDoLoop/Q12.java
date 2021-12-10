package javaPractise4WhileDoLoop;

import java.util.Scanner;

public class Q12 {

    //Bir top belirli bir  yükseklikten atılmaktadır.
    // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulunuz.

    public static void main(String[] args) {

    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("yuksekligi girinz: ");
    	double yukseklik = scan.nextDouble();
    	int zipSayisi=0;
    	double aldigiYol=0;
    	while(yukseklik>=1) {
    		
    		aldigiYol+=yukseklik;
    		yukseklik*=0.75;
    		aldigiYol+=yukseklik;
    		zipSayisi++;
    	}System.out.println("Topun toplam aldigi yol: "+aldigiYol+"metre ve Toplam yere vurma sayisi: "+zipSayisi);
    		
    }
}
