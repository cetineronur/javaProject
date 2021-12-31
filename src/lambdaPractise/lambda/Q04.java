package lambdaPractise.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q04 {
    //        3) "Ali", "John", "Ali", "Alexander", "Taylor", "Ali", "Jackson" öğelerini içeren bir Dize listesi oluşturun
//        4) "J" ile baslayin olan öğeleri almayın
//        5) Farklı öğeleri seçin
//        6)Karakter sayısına göre doğal sıraya koyun
//        7) Tüm öğeleri büyük harfe dönüştürün
//        8) Konsoldaki öğeleri yazdırın
//        9)Fonksiyonel Programlama'yı kullanın
//        */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Ali", "John", "Ali", "Alexander", "Taylor","Ali","Jackson"));
    jIleBaslamayanOgeler(list);

    krakterSayiDogalSira(list);
    tumOgeBuyukHarf(list);

    }

    private static void jIleBaslamayanOgeler(List<String> list) {
        System.out.println();
        System.out.println(list.stream().filter(t ->!t.substring(0, 1).equals("J")).toList());
    }


    private static void krakterSayiDogalSira(List<String> list) {

        System.out.println();
        System.out.println(list.stream().sorted(Comparator.comparing(t->t.toString().length())).toList());
    }

    private static void tumOgeBuyukHarf(List<String> list) {

        System.out.println();
        System.out.println(list.stream().map(t -> t.toUpperCase()).toList());
    }
}
