package tag29;

import java.util.Arrays;
import java.util.Scanner;

public class ubung {

	public static void main(String[] args) {
		/*Belirli bir sıralanmamış pozitif tamsayı dizisinden olası 
		üçgenlerin sayısını sayan bir Java programı yazın.
		Not: Üçgen eşitsizliği, bir üçgenin herhangi iki kenarının toplamının 
		üçüncü kenarın uzunluğundan büyük veya ona eşit olması gerektiğini 
		belirtir.*/
		Scanner scan=new Scanner(System.in);
		System.out.println("kac sayi gireceksiniz");
		int sayi=scan.nextInt();
		int b=0;
		double[] ucgen=new double[sayi];
		while (b<sayi) {
			System.out.println(b+1+". sayiyi giriniz:");
			ucgen[b]=scan.nextDouble();
			b++;
		}

		int a=0;
		for (int i = 0; i < ucgen.length-2; i++) {
			
			for (int j = i+1; j < ucgen.length-1; j++) {
				if (((ucgen[i]<=ucgen[j]+ucgen[j+1])&&(ucgen[i]>=ucgen[j]-ucgen[j+1]))||
					((ucgen[j]<=ucgen[i]+ucgen[j+1])&&(ucgen[j]>=ucgen[i]-ucgen[j+1]))||	
					((ucgen[j+1]<=ucgen[i]+ucgen[j])&&(ucgen[j+1]>=ucgen[i]-ucgen[j]))) {
					
			System.out.println(""+ucgen[i]+" "+ucgen[j]+" "+ ucgen[j+1]+" sayilari ucgen olusturabilir");
			a++;
				}
			}		
		}
		System.out.println();
		System.out.println(Arrays.toString(ucgen));
		System.out.println("sayilari ile "+a+" farkli ucgen olusturulabilir.");
	}

}
