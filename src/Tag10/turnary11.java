package Tag10;

public class turnary11 {

	public static void main(String[] args) {
		//Kullanicidan bir harf isteyin kucuk harf ise consola “Kucuk Harf” , buyuk harfse
				//consola “Buyuk Harf” yoksa “girdiginiz karakter harf degil” yazdirin.
		char krk='1';
		String sonuc = (krk>='a' && krk<='z')?"kucuk harf":(krk>='A'&& krk<='Z')?"buyuk harf":"girilen karakter harf degil";
		System.out.println(sonuc);
	
		if (krk>='a' && krk<='z') {
			System.out.println("kucuk harf");
		}else if (krk>='A' && krk<='Z') {
			System.out.println("buyuk harf");
		}else {
			System.out.println("girilen karakter harf degil");
		}
	
	
	}
}
