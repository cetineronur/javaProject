package day17;
public class forLoop2 {
	public static void main(String[] args) {
		//100’den baslayarak 50’ye kadar olan sayilari 
		//aralarinda virgule olarak ayni satirda yazdirin

		for (int i = 100; i>=50; i--) {
			if (i==50) {
				System.out.println(i);
			}else {
				System.out.print(i+", ");
			}
			
		}
		
	}

}
