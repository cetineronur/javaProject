package lambdaPractise.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Q05 {
    //         {"A", "B", "D", "C", "B", "A", "A", "B", "B"} gibi bir array oluşturun;
//         Tekrarlanan öğeleri konsolda yazdırın
    public static void main(String[] args) {
        String[] array = {"A", "B", "D", "C", "B", "A", "A", "B", "B"};

        tekrarOge(array);
    }

    private static void tekrarOge(String[] array) {

        System.out.println();
        System.out.println(Arrays.stream(array).distinct().sorted().toList());
    }
}
