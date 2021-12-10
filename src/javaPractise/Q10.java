package javaPractise;
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        /*Kulanıcıdan aracının hızını alınız
        Trafik cezasının değerini hesaplayın.
            45 hız sınırıdır.
            Eğer hızınız 55-74 arasında ise:
            Ceza 100 $'dır.
            Eğer hızınız 75 - 84 arasında ise:
            Ceza 150 $'dır.
            Eğer hızınız 85 -94 arasında ise:
            Ceza 320 $'dır.
            Eğer hızınız 94'den daha fazla ise:
            Ceza 500 $'dır.
            ve ayrıca,
            Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

            Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.

-----------------------------------------

            Örn;

            currentSpeed(Hızınız) 87
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

            sonuç 320 olmalıdır.

            currentSpeed(Hızınız) 65
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

            sonuç 300 olmalıdır.
     */
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.print("Hizinizi giriniz: ");
    	double hiz = scan.nextDouble();
    	System.out.print("Ehliyetiniz var mi?E yada H girin. ");
    	char ehliyet = scan.next().toUpperCase().charAt(0);
    	int ceza=100,ceza1=150, ceza2=320,ceza3=500;
    	
    	if (ehliyet=='E') {
			if (hiz>55) {
				System.out.println("Cezaniz: "+ceza+" Euro");
			}else if (hiz>75) {
				System.out.println("cezaniz: "+ceza1+" Euro");
			}else if (hiz>84) {
				System.out.println("cezaniz: "+ceza2+" Euro");
			}else if (hiz>94){
				System.out.println("cezaniz: "+ceza3+" Euro");
			}
		}else if (ehliyet=='H') {
			if (hiz>55 && hiz<=75) {
				System.out.println("Cezaniz: "+(ceza+200)+" Euro");
			}else if (hiz>75 && hiz<=84) {
				System.out.println("cezaniz: "+(ceza1+200)+" Euro");
			}else if (hiz>84&& hiz<=94) {
				System.out.println("cezaniz: "+(ceza2+200)+" Euro");
			}else if (hiz>94){
				System.out.println("cezaniz: "+(ceza3+200)+" Euro");
			}
		}
           		scan.close();
    }
}
