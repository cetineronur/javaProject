package day13;

public class replaceAll {

	public static void main(String[] args) {
		String sifre = "*Java 98grenmek c..ok k876olay";
		// replaceAll methodlarini kullanarak "java ogrenmek cok kolay" cevirecez
		sifre=sifre.replaceAll("\\d", "");
		
		System.out.println(sifre);
		
		sifre=sifre.replaceAll("\\s", "x");
		System.out.println(sifre);
		
		sifre=sifre.replaceAll("\\W", "");
		System.out.println(sifre);

	}

}
