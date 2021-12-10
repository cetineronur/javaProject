package tag27_Constructor_ConstructorCall;

public class Tir {

	
		int yil=2000;
		String renk;
		String model;
		int km=12000;
		boolean satilikMi;

		public Tir(int i, String string, String string2, int j, boolean b) {
			// TODO Auto-generated constructor stub
			
			km=i;
			model=string;
			renk=string2;
			yil=j;
			satilikMi=b;
		}

		public Tir(int i, String model, String renk) {
			// i, string ve string2 isim olarak guzel isimler degil.
			// kodumuzu sonradan incelerken anlasilir degil
			// variable isimlerini anlamli yapalim
			
			this.km=km;
			this.model=model;
			this.renk=renk;
		}	
		
		

	

}
