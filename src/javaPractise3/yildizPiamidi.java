package javaPractise3;

public class yildizPiamidi {

	public static void main(String[] args) {
	/*Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
	 Sonuç böyle olmalıdır;

	                   *
	                  * *
	                 * * *
	                * * * *
	               * * * * *
               şeklini konsola yazdiriniz.
	*/
		int k=6;
		
		for (int i = 0; i <k; i++) {
			for (int j = i; j<k-1; j++) {
				System.out.print(" ");
				}
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
			}
		}
	}

