package Tag20;
import java.util.Scanner;
public class doWhileLoop2 {
    public static void main(String[] args) {
        /*
        Frage 5) Bitten Sie den Benutzer, ein Passwort einzugeben.
          Überprüfen Sie das eingegebene Passwort gemäß den folgenden Bedingungen
          und drucken Sie die Fehler im Passwort.
         Wiederholen Sie diesen Vorgang, bis der Benutzer ein gültiges Passwort eingibt
         und drucken Sie "Ihr Passwort akzeptiert", wenn ein gültiges Passwort eingegeben wird.
         - Das Passwort muss Kleinbuchstaben enthalten
         - Das Passwort muss Großbuchstaben enthalten
         - Passwort muss Sonderzeichen enthalten
         - Das Passwort muss mindestens 8 Zeichen lang sein.
         */
        
        Scanner scan= new Scanner(System.in);
        String sifre="";
        boolean khk=false;
        boolean bhk=false;
        boolean okk=false;
        boolean uk=false;
        do {
            System.out.println("Lutfen bir sifre giriniz");
            sifre = scan.nextLine(); 
            
            khk=kucukHarfKontrol(sifre);
            bhk= buyukHarfKontrol(sifre);
            okk= ozelKarakterKontrol(sifre);
            uk=uzunlukKontrolu(sifre);
            
        }while(!khk || !bhk || !okk || !uk);
        
        System.out.println("sifreniz basarili bir sekilde kaydedildi");
        
        scan.close();
    }
    private static boolean uzunlukKontrolu(String sifre) {
        boolean uk=false;
        if (sifre.length()>=8) {
            uk=true;
        } else {
            System.out.println("sifreniz en az 8 karakter olmalidir");
        }
        return uk;
    }
    private static boolean ozelKarakterKontrol(String sifre) {
        boolean okk=false;
        String harfler="!@#$%^&*()_-+=/?<,>.|";
        for (int i = 0; i <sifre.length(); i++) {
            
            if (harfler.contains(sifre.substring(i,i+1))) {
                okk=true;
                break; 
            }       
        }
        
        if (!okk) {
            System.out.println("Sifreniz en az bir ozel karakter icermelidir");
        }
        
        
        return okk;
    }
    private static boolean buyukHarfKontrol(String sifre) {
        boolean bhk=false;
        String harfler="ABCDEFGHIJKLMNOPRSTUVYZWQX";
        for (int i = 0; i <sifre.length(); i++) {
            
            if (harfler.contains(sifre.substring(i,i+1))) {
                bhk=true;
                break; 
            }       
        }
        
        if (!bhk) {
            System.out.println("Sifreniz en az bir buyuk harf icermelidir");
        }
        
        return bhk;
    }
    private static boolean kucukHarfKontrol(String sifre) {
        boolean khk=false;
        
        String harfler="abcdefghijklmnoprstuvyzqwx";
        
        for (int i = 0; i <sifre.length(); i++) {
            
            if (harfler.contains(sifre.substring(i,i+1))) {
                khk=true;
                break; // break kullanmamizin sebebi : soruda 1 tane kucuk harf olmasi yeterli
                        //  biz kucuk harfi bulduktan sonra kodu durdurmazsak
                        // sonradan karsimiza cikacak Buyuk harfler bizi yaniltir
            }
        }
        // bu satira geldigimde sifrede kucuk harf varsa khk=true, hic kucuk harf yoksa khk=false
        if (!khk) {
            System.out.println("Sifreniz en az bir kucuk harf icermelidir");
        }
        return khk;
    }
}