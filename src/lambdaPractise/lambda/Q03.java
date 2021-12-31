package lambdaPractise.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q03 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Ali", "Ahmet", "Ali", "Ramazan", "Nevin","Abuziddin","Mustafa", "Ahmet","Nevin"));
        method(list);
        farkliOgelerUzunlukSirali(list);
        farkliOgelerSonKrarkterSirali(list);
        farkliOgelertersSirali(list);
        uuznlukYediKucukTersSiraBuyukHarf(list);
    }
    //Konsoldaki farklı öğeleri uzunluklarıyla birlikte yazdırın.
    private static void method(List<String> list) {
        System.out.println();
        list.stream().distinct().sorted().forEach(t->System.out.print(t+"="+t.length()+" "));
        System.out.println();
    }

    //Konsoldaki farklı öğeleri yazdırın, uzunluklarına göre sıralayın.
    private static void farkliOgelerUzunlukSirali(List<String> list) {
        System.out.println();
        System.out.println(list.stream().distinct().sorted(Comparator.comparing(t->t.length())).toList());
    }

    //Konsoldaki farklı öğeleri yazdırın, son karakterlerine göre sıralayın.
    private static void farkliOgelerSonKrarkterSirali(List<String> list) {
        System.out.println();
        System.out.println(list.stream().distinct().sorted(Comparator.comparing(t->t.substring(t.length()-1))).toList());
    }

    //Konsoldaki farklı öğeleri ters sırada yazdırın.
    private static void farkliOgelertersSirali(List<String> list) {
        System.out.println();
        System.out.println(list.stream().distinct().sorted(Comparator.reverseOrder()).toList());
    }

    //Uzunluğu 7'den küçük olan farklı öğeleri ters sırada konsolda büyük harflerle yazdırın.
    private static void uuznlukYediKucukTersSiraBuyukHarf(List<String> list) {
        System.out.println();
        System.out.println(list.stream().distinct().filter(t -> t.length() < 7).sorted(Comparator.reverseOrder()).map(t -> t.toUpperCase()).toList());
    }

}
