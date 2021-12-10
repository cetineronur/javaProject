package day17;

public class forLoop {

	public static void main(String[] args) {
		/*	for (int i = 0; i<=10; i++) {
			System.out.print(i+" ");
		}
		// for loop baslangic ve bitis sarti bir sayinin degerine 
		//bagli olan durumlarda tercih edilir.
		for (int i = 0; i>10; i--) {
			System.out.println(i+" ");
			*/
		// eger baslangic sayisi artis/azalis ile 
		// bitis degerine yaklasmiyor, uzaklasiyor ise loop hicbir zaman durmaz.
		// bu duruma sonsuz loop denir.
		
	for (int i = 0; i>10; i++) {
		System.out.print(i+" ");
	}
	//eger ilk deger icin bitis sarti true olmazsa
	//daha ilk adimda loop broken olur.
	//dolayisiyla loop body hic calismadan loop'un sonuna gelir.
	
	
	}

}
