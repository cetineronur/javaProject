package tag34accessDeneme;

import tag34accessModieferEncapsulatio.C01;

public class C02_BaskaPackageChildClass extends C01 {

	public static void main(String[] args) {
		C01 obj = new C01();
		
		//System.out.println(obj.sayiPrivate);
		//System.out.println(obj.sayiDefault);   
		//System.out.println(obj.sayiProtected); 
		System.out.println(obj.sayiPublic);
		
	}

}
