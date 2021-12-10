package javaPractise;
import java.util.Scanner;
public class Q08 {
	/*Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
	 * musteri karti olup olmadigini sorun
	 * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin 
	 * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
	 * alirsa %10 indirim yapin
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
    	System.out.print("Aldiginiz urun adedini giriniz: ");
    	int adet = scan.nextInt();
    	System.out.print("Liste fiyatini giriniz: ");
    	double fiyat = scan.nextDouble();
    	System.out.print("Musteri kartiniz var mi?E yada H girin. ");
    	char kart = scan.next().toUpperCase().charAt(0);
		double tutar = fiyat*adet;
    	if (kart=='E') {
			if (adet>10) {
    		    System.out.println("odeyeceginiz tutar: "+(tutar*80/100));
			}else if (adet<=10) {
				System.out.println("odeyeceginiz tutar: "+(tutar*85/100));
			}
    	}else if (kart=='H') {
    		if (adet>10) {
    			System.out.println("odeyeceginiz tutar: "+(tutar*85/100));
    		}else if (adet<=10){
    			System.out.println("odeyeceginiz tuttar: "+(tutar*90/100));
    		}
    		   }
    		scan.close();
}
}