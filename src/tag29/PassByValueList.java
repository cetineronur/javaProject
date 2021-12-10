package tag29;

import java.util.ArrayList;
import java.util.List;

public class PassByValueList {

	public static void main(String[] args) {
		// bir list olusturalim
		// sonra list elemanlarini degistir methoddu yazip orada
		// list elemanlarindan bazilarini degistirelim
		// method void olsun
		// main meyhoda dondukten sonra yeniden listi yazdiralim.
		List<String> harfler = new ArrayList<>();
		
		harfler.add("A");
		harfler.add("B");
		harfler.add("C");
		
		listElemanlarDegistir(harfler);
		System.out.println("Main Method'a donunce list :"+harfler);
		
		listDegistir(harfler);
		System.out.println("Liste yeni list atadiktan sonra main methoda donunce list : "+harfler);
	}

	private static void listDegistir(List<String> harfler) {
		harfler=new ArrayList();
		System.out.println("List'e yeni deger atayinca: "+harfler);
		
	}

	private static void listElemanlarDegistir(List<String> harfler) {
		harfler.set(0,"D");
		System.out.println("Methodda :"+harfler);
		
	}

}
