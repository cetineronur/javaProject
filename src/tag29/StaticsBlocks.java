package tag29;

public class StaticsBlocks {

	static {
		System.out.println("static blok main method'dan bile once calisir ?");
	}
	
	
	public static void main(String[] args) {
		System.out.println("javada once main method calisir.");
		
	}
	static {
		System.out.println("static blok nereye yazilirsa yazilsin. main method'dan bile once calisir ?");
	}
	//eger birden fazla satic blok varsa java yukaridakini daha once calistirir.
}
