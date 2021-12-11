package Tag18;

import java.util.Scanner;

public class forLoop12 {

	public static void main(String[] args) {
		/*Fragen Sie den Benutzer nach einer ganzen 
		Zahl kleiner als 10 und finden Sie die 
		Fakultät der eingegebenen Zahl.5!=5*4*3*2*1=120  */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie eine Zahl unter 10 ein: ");
		int zahl = scan.nextInt();
		int fakultat=1;
		System.out.print(zahl +"'in faktoriyeli: ");
		scan.close();
		
		if (zahl<=10 && zahl>0) {
			for (int i = zahl; i >1 ; i--) {
				fakultat*=i;
				System.out.print(i+"*");
			}System.out.print("1= "+fakultat);
		}else if (zahl<0) {
			System.out.println("Lutfen pozitif bir sayi giriniz");
		}
		
	
	
	}
		
	
	}
	


