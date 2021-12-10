package tag34accessDeneme;

import tag34accessModieferEncapsulatio.C01;

public class C01_BaskaPackage {

	public static void main(String[] args) {
		C01 obj = new C01();
		
		System.out.println(obj.sayiPrivate);
		System.out.println(obj.sayiDefault);   // sadece ayni package dakiler ulasabilir.
		System.out.println(obj.sayiProtected); // ayni packagedaki classlar ve child classlar ulasabilir.
		System.out.println(obj.sayiPublic);

	}

}
