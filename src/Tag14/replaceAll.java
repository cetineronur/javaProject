package Tag14;

public class replaceAll {

	public static void main(String[] args) {
		// String methodlarini kullanarak “ Java ogrenmek123 Cok guzel@ ” 
		//String’ini “Java ogrenmek cok guzel.” sekline getirin.
		
		String cumle = "Java ogrenmek123 Cok guzel@ ";
		System.out.println(cumle=cumle.replaceAll("\\d", ""));// \\d rakamlarin yerine bos koyduk
		System.out.println(cumle.replace("@", ""));
	}

}
