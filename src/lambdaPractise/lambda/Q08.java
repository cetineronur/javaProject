package lambdaPractise.lambda;

import java.util.stream.IntStream;

public class Q08 {
    // 7 ile bolunebilen ilk 10 tamsayinin toplamini ekrana yazdiriniz.
    public static void main(String[] args) {

        yediileBolunenilkOnSayiToplam(10);

    }

    public static void yediileBolunenilkOnSayiToplam(int a){
        IntStream.iterate(7, t -> t + 7).limit(a).forEach(Q06::print);

    }
}
