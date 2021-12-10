package tag38_Overriding;

public class Baliklar extends Animals{

	public static void main(String[] args) {

		Baliklar balik1 = new Baliklar();
		balik1.beslenme();
		balik1.hareket();
		balik1.solunum();

	}
	@Override
	public void hareket() {
		System.out.println("Baliklar yuzerek hareket eder");
	}


	public void solunum() {
		System.out.println("Baliklar solungaclariyla nefes alir.");
	}
}
