package javaPractise;
import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
    /*  Problem Tanımı
        Kullanıcıdan bir tarihi gün, ay ve yıl şeklinde alıp bu tarihi
        ay, gün, yıl ve yıl, ay, gün sıralarına çevirerek yazan bir kod yazınız.
    	TRICK: her else komutundan sonra return; komutu kullanınız...

        Örnek Ekran Çıktısı
        Lütfen günü giriniz: 10
        Lütfen ayı giriniz: 02
        Lütfen yılı giriniz: 2009
        Gün ay yıl: 10.02.2009
        Ay gün yıl: 02.10.2009
        Yıl ay gün: 2009.02.10
        */
    	Scanner scan = new Scanner(System.in);
    	System.out.print("Lutfen gunu giriniz: ");
    	int gun = scan.nextInt();
    	System.out.print("Lutfen ayi giriniz: ");
    	int ay = scan.nextInt();
    	System.out.print("lutfen yili girin. ");
    	int yil = scan.nextInt();
    	System.out.println(gun+"."+ay+"."+yil);
    	System.out.println(ay+"."+gun+"."+yil);
    	System.out.println(yil+"."+ay+"."+gun);
    	
    	if (gun<10&&ay<10&&yil>0) {
    		System.out.println("0"+gun+"."+"0"+ay+"."+yil);	
    		System.out.println("0"+ay+"."+"0"+gun+"."+yil);	
    		System.out.println(yil+"."+"0"+ay+"."+"0"+gun);	
    		
		}else if ((gun<10&&ay>=10)&&ay<13&&yil>0) {
			System.out.println("0"+gun+"."+ay+"."+yil);	
    		System.out.println(ay+"."+"0"+gun+"."+yil);	
    		System.out.println(yil+"."+ay+"."+"0"+gun);	
		}else if (gun>9&&gun<=31&&ay<10&&yil>0) {
			System.out.println(gun+"."+"0"+ay+"."+yil);	
    		System.out.println("0"+ay+"."+gun+"."+yil);	
    		System.out.println(yil+"."+"0"+ay+"."+gun);	
		}else if ((gun>9&&gun<=31)&&(ay==10&&ay==11&&ay==12)&&yil>0){
			System.out.println(gun+"."+ay+"."+yil);	
    		System.out.println(ay+"."+gun+"."+yil);	
    		System.out.println(yil+"."+ay+"."+gun);	
			
		}else if (gun>=32||ay>=13||yil<1||(gun<32&&ay>12)) {
			System.out.println("lutfen gecerli bir yil veya ay giriniz");
		}
    	
    	scan.close();
    }
}
