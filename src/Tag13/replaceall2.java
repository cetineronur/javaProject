package Tag13;

public class replaceall2 {

	public static void main(String[] args) {
		String cumle = "Java   cok              zevkli";
		cumle=cumle.replaceAll("\\s+", " ");// birden fazla boslugu bire dusurur.
		System.out.println(cumle); // Java cok zevkli
		
		//cumle=cumle.replaceAll("[a-z]", "");// a ile z arasindaki harfleri yok etti.
		System.out.println(cumle); // J
		System.out.println(cumle.replaceAll("\\s", "*")); //bosluklara * koyar.
		System.out.println(cumle.replaceAll("\\S", "*")); // bosluk disindakilere * koyar.
	}

}
