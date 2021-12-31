package lambdaPractise.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q07 {
    //String isimlerden olusan bir list olusturnuz


    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Ali", "Ahman", "Ali", "Ramazan", "Nevin","Abuziddin","Mustafa", "Ahmet","Nevin"));

        aVeNIcerenHarfSayiToplam(list);
        ilkHarfSonHarfOnde(list);

    }
    //List'deki isimlerden "a" ve "n" icerenlerin harf sayilarinin toplamini ekrana yazdiriniz
    private static void aVeNIcerenHarfSayiToplam(List<String> list) {
        System.out.println();
        System.out.println(list.stream().filter(t -> t.contains("a") & t.contains("n")).mapToInt(t -> t.length()).sum());
    }

    //List'deki isimlerden ilk harfi son harfinden alfabetik olarak onde olan isimleri ekrana yazdirin
    private static void ilkHarfSonHarfOnde(List<String> list) {
        System.out.println();
        System.out.println(list.stream().sorted(Comparator.comparing(t -> t.charAt(0) > t.charAt(t.length() - 1))).toList());
    }
}
