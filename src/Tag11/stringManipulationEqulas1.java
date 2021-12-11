package Tag11;
import java.util.Scanner;
public class stringManipulationEqulas1 {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		//Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup
		//olmadigini yazdirin
	Scanner scan = new Scanner(System.in);
	System.out.println("BIr cumle giriniz");
	String cumle=scan.nextLine();
	System.out.println("bir de harf giriniz");
	String harf =scan.next();
		
	//System.out.println(cumle.indexOf(harf));//harfin kacinci sirada oldugunu gosterdi.
	//System.out.println(harf.length());//kelimenin krakter sayisini yazar.
		if (cumle.indexOf(harf)==-1) {
			System.out.println("yazdiginiz harf cumlede yok");
		}else {
			System.out.println("yazdiginiz harf cumlede var.");
		}
	scan.close();
		
	}

}
