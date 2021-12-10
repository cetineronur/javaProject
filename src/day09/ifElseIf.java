package day09;

import java.util.Scanner;

public class ifElseIf {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Lutfen iki sayi giriniz\nilk sayiyi girince enter'a basin");
	double sayi1 = scan.nextDouble();
	double sayi2 = scan.nextDouble();
	
	System.out.println("Lutfen yapmak istediginiz islemi seciniz\n1:Toplama "
			+ "\n2:Cikarma \n3:Carpma \n4:Bolme");
	int islem = scan.nextInt();
	
	if (islem==1) {
		System.out.println("birinci islemi sectiniz toplamlari: "+(sayi1+sayi2));
	} else if(islem==2) {
		System.out.println("ikinci islemi sectiniz farklari: "+ (sayi1-sayi2));
	}
	  else if(islem==3){
		System.out.println("ucuncu islemi sectiniz carpimlari: " + (sayi1+sayi2));
	}

	  else if(islem==4){
		System.out.println("dorduncu islemi sectiniz bolumleri: " + (sayi1/sayi2));
	}
	  else {
		  System.out.println("lutfen gecerli bir sayi giriniz: ");
	}
	scan.close();
	  }

	}


