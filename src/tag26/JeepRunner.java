package tag26;

public class JeepRunner {

	public static void main(String[] args) {
		// Jeep class'indan bir obje olusturalim ve ozelliklerini yazdiralim
		
	Jeep jeep = new Jeep();

	jeep.hiz(150);
	jeep.yakit("benzin");
	
	
	jeep.ilanNo=1001;
	jeep.marka="Toyata";
	jeep.yil=2010;
	jeep.model="Verso";
	
	System.out.println(jeep.ilanNo+" ile yayinlanan arabamiz "+jeep.marka+" markasi olup "
			+jeep.yil+" yilinda uretilmis "+
			jeep.model+" modelinde bir arabadir.");
	}

}