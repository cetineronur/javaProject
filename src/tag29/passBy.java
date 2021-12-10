package tag29;

public class passBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fiyat =100;
		
		indirimYap25(fiyat);
		System.out.println("method'dan sonra main methodaaki fiyat : "+fiyat);
		indirimYap10(fiyat);
		System.out.println("method'dan sonra main methodaaki fiyat : "+fiyat);
	}

	private static void indirimYap25(int fiyat) {
		fiyat*=0.75;
		System.out.println("%25 inidirmli fiyat : "+fiyat);
		
	}

	private static void indirimYap10(int fiyat) {

		fiyat*=0.90;
		System.out.println("%10 inidirmli fiyat : "+fiyat);
		
	}

}
