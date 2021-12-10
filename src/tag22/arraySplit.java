package tag22;

public class arraySplit {

	public static void main(String[] args) {
		// "java ogrenmek cok guzel 
		// cumlesinin kelimelerini ters sira yazdirin.
		String cumle="java ogrenmek cok guzel";
		String arr1[]=cumle.split(" "); // her bosluk karakterinden ayirarak bir diziye attik.
		for (int i = arr1.length-1; i>=0; i--) {
			System.out.print(arr1[i]+" ");
		}

	}

}
