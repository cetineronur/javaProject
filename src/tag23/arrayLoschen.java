package tag23;
import java.util.Arrays;
import java.util.Scanner;
public class arrayLoschen {

	public static void main(String[] args) {
	
	//Verilen bir Array’den istenen degere esit olan elamanlari silip, kalanlari yeni bir
	//Array olarak yazdiran bir method yaziniz

		Scanner scan = new Scanner(System.in);
		System.out.println("10 tane sayi giriniz: ");	
		int dizi[] = new int [10];
			
		for (int i = 0; i < dizi.length; i++) {
			dizi[i]=scan.nextInt();
		}System.out.println(Arrays.toString(dizi));
		
		System.out.println("silmek istediginiz degeri yaziniz: ");
		int a = scan.nextInt();
		int sayac=0;
		
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i]==a) {
				sayac++;
			}
		}
		int yeniLength=dizi.length-sayac;
		int [] neuDizi=new int[yeniLength];
		
		int j=0;
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i]!=a) {
				neuDizi[j]=dizi[i];
				j++;
				
			}
		}System.out.println(Arrays.toString(neuDizi));
	}
}



