package Tag03;
public class DataCasting {
	public static void main(String[] args) {
		byte sayi1=44;
		short sayi2=sayi1;
		int sayi3= sayi2;
		System.out.println(sayi3);
		
		int sayi4=++sayi2;
		int sayi5=sayi4++;
		
		System.out.println(sayi4);
		System.out.println(sayi5);
	}
}
