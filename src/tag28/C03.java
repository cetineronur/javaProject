package tag28;

public class C03 {

	public static void main(String[] args) {
		
		staticKeyword obje = new staticKeyword();
		System.out.println("obje icin x: "+obje.x+" obje icin y: "+obje.y);
		
		
		obje.x++;
		obje.y++;
		System.out.println("islemden sonra obje icin x: "+obje.x+" obje icin y: "+obje.y);
		
		staticKeyword obje2 = new staticKeyword();
		System.out.println("obje2 icin x: "+obje2.x+" obje2 icin y: "+obje2.y);
		
		obje2.x++;
		staticKeyword.y++;
		System.out.println("islemden sonra obje2 icin x: "+obje2.x+" obje2 icin y: "+obje2.y);
		
		System.out.println("obje 2 olusturulduktan sonra obj1'in "+" \n'x : "+obje.x+" y : "+obje.y);
		
		staticKeyword obje3 = new staticKeyword();
		obje3.x=20;
		obje3.y=40;
		
		System.out.println("obje3'den sonra obje'nin x: "+obje.x); // 6 
		System.out.println("obje3'den sonra obje'nin x: "+obje2.x); //6
		System.out.println("obje3'den sonra obje'nin x: "+obje3.x); //20
		
		System.out.println("obje3'den sonra obje'nin x: "+obje.y); // 40
		System.out.println("obje3'den sonra obje'nin x: "+obje2.y); //40
		System.out.println("obje3'den sonra obje'nin x: "+obje3.y); //40

	}

}
