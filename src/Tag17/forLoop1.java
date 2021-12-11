package Tag17;

public class forLoop1 {

	public static void main(String[] args) {
		// Ekrana 10 kez "java guzeldir" yazdirin.
		
		for (int i = 0; i<10; i++) {
			System.out.println(i+1+". Java guzeldir.");
		}
		//10 ile 30 arasindaki sayilari aralarina virgul koyarak ayni satirda yazdirin
		for (int i = 10; i<=30; i++) {
			if (i==30) {
				System.out.println(i);//30.satira , koymasin diye if dongusu actik.
			}else {
				System.out.print(i+",");
			}
			}
		
	}

}
