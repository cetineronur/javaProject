package Tag07;
public class relationalOperation {
	public static void main(String[] args) {
		boolean sayi=(5+2==7)&&(4+3!=5);
		boolean sayi1=(5+2==7)||(4+3!=5);
		System.out.println(sayi);
		System.out.println(sayi1);
		
		System.out.println(5+3==8 || 6+5==10||7-2==3);
		
		int a=10, b=20, c=30;
		boolean sonuc = a>b || b>c || a+b>=c;
		System.out.println(sonuc);
		
		int yas=50;
		int boy=185;
		char cinsiyet ='M';
		System.out.println(yas<30 && boy>170 && cinsiyet=='M');
	}
}
