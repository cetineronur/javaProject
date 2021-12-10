package day10;
public class switchStatement1 {
	public static void main(String[] args) {
		// gun numarasina gore haftaici veya haftasonu yazdirin
		int gunNo=6;
		
		switch(gunNo) {
		
		case 1:
		case 2:
		case 3:
		case 4:	
		case 5:
			System.out.println("hafta ici");
			break;
		case 6:	
		case 7:	
			System.out.println("haftasonu");
			break;
		default:
			System.out.println("gecersiz rakam");
	}
	}

}
