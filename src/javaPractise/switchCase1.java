package javaPractise;
import java.util.Scanner;
public class switchCase1 {
	public static void main(String[] args) {
		// Kullanıcıdan notunu alın ve aşağıdaki kurallara göre ekrana 
		// A, B, C veya D yazdırın.
		// 1. 0()dahil ile 50 arasi - D   
		// 2. 50(dahil) ile 60 arası - C   
		// 3. 60(dahil) ile 80 arası - B  
		// 4. 80(dahil) ustu- A
		// Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
		// switch() kullanarak yapiniz.
		
		// switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		// switch() de int, byte, short, char, String kullanilir.
		Scanner scan = new Scanner(System.in);
    	System.out.println("notunuzu giriniz");
    	int not = scan.nextInt();
        	
    	switch (not/10) {
    	case 1: 
    		System.out.println("notunuz: "+not+" Notunuzun harf karsiligi: D' dir");
    		break;
    	case 2:
    		System.out.println("notunuz: "+not+" notunuzun harf karsiligi D' dir");
    		break;
    	case 3:
    		System.out.println("notunuz: "+not+" notunuzun harf karsiligi D' dir");
    		break;
    	case 4:
    		System.out.println("notunuz: "+not+" notunuzun harf karsiligi D' dir");
    		break;
    	case 5: 
    		System.out.println("notunuz: "+not+" notunuzun harf karsiligi C' dir");
    		break;
    	case 6:
    		System.out.println("notunuz: "+not+" notunuzun harf karsiligi B' dir");
    		break;
    	case 7:
    		System.out.println("notunuz: "+not+" notunuzun harf karsiligi B' dir");
    		break;
    	case 8:
    		System.out.println("notunuz: "+not+" notunuzun harf karsiligi A' dir");
    		break;
    	case 9:
    		System.out.println("notunuz: "+not+" notunuzun harf karsiligi A' dir");
    		break;
    	case 10:
    		System.out.println("notunuz: "+not+" notunuzun harf karsiligi A' dir");
    		break;
       	default:
    			System.out.println("yanlis giris yaptiniz. lutfen tekrar dogru giris yapin");			
    			
    	}
    	scan.close();
    	}
}
