package tag31;

public class Varargs {

	public static void main(String[] args) {
		// verilen sayilari toplayan bir metod olusturmak istiyorum.
		
		int a=10;
		int b=20;
		int c=20;
		int d=30;
		//String e="k";
		
		topla(a,b,c,d);
}

	private static void topla(int sayi1,int sayi2,int sayi3,int sayi4, int... f) {
		System.out.println("varargs calisir");
		int toplam=0;
				for (int i : f) {
					toplam+=i;
				}
				System.out.println(toplam);
		
	}

	

}
