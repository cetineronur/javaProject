package day09;
import java.util.Scanner;
public class ifElse6 {
	public static void main(String[] args) {
		 //SORU 1
	     /* 
	     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
	     * musteri karti olup olmadigini sorun
	     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin 
	     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
	     * alirsa %10 indirim yapin
	     */
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Kac urun aldiniz: ");
		 int urunsayisi = scan.nextInt();
		 System.out.println("Liste fiyatini girin: ");
		 double listefiyati = scan.nextDouble();
		 System.out.println("musteri kartiniz var mi? E yada H yazin: ");
		 char kart = scan.next().toUpperCase().charAt(0);
		 
		 if ((kart=='E') && (urunsayisi>10)) {
			 System.out.println("odeyeceginiz tutar : "+(urunsayisi*listefiyati*80/100));
		 }else if ((kart=='E') && (urunsayisi<10)) {
			 System.out.println("odeyeceginiz tutar: "+(urunsayisi*listefiyati*85/100));
		 }else if ((kart=='H') && (urunsayisi>10)) {
			 System.out.println("odeyeceginiz tutar: "+(urunsayisi*listefiyati*85/100));
		 }else if ((kart=='H') && (urunsayisi<10)) {
			 System.out.println("odeyeceginiz tutar: "+(urunsayisi*listefiyati*90/100));
		 }else {
			 System.out.println("lutfen buyuk harfle girin");
		 }
		 scan.close();
	}

}
