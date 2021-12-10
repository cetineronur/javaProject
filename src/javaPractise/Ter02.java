package javaPractise;
import java.util.Scanner;
public class Ter02 {
    public static void main(String[] args) {
        // Kullanicidan bir character girmesini isteyiniz
        // Character harf ise kucuk harf olup olmadigini kontrol ediniz
        // Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
        // Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
        // Harf degilse ekrana "Harf degil" yazdiriniz
        //97:a  122:z ascii değeri
    	Scanner scan = new Scanner(System.in);
		 System.out.println("lutfen bir harf giriniz");
		 char harf = scan.next().charAt(0);
		 
		 System.out.println("*****ternary cozumu*****");
		 System.out.println((harf>=97&&harf<=122)?"kucuk harf":(harf>=65&&harf<=90)?"buyuk harf":"harf degil");
		 System.out.println("*****if cozumu*****");
       if ((harf>=97&&harf<=122)||(harf>=65&&harf<=90)) {
    	   if((harf>=97&&harf<=122)) {
    		   System.out.println("Kucuk harf");
    	   }else if (harf>=65&&harf<=90) {
    		   System.out.println("buyuk harf");
    	   }
       }else {
		System.out.println("harf degil");
	}
       scan.close();
    }
}
