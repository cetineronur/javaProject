package Lambda01;

import java.util.stream.IntStream;

public class Lambda06 {
    public static void main(String[] args) {
        System.out.println(tola(10));
        System.out.println(topla(10));
        System.out.println(topla1(10));
        System.out.println(toplaCift(10));
        System.out.println(toplaCift1(10));
        System.out.println(toplaTekSayi(10));
        ikiIlkXKuvvet(10);
        istenenSayiIlkKuvvet(2,3);
        System.out.println(istenenSayiXinciKuvvet(2, 4));
        System.out.println(istenenSayiFaktoriyel(5));
    }

    //TASK 01 --> Structured Programming ve Functional Programming
    // ile 1'den x'e kadar tamsayilari toplayan bir program yaziniz.
    //Structured programming
    public static int tola(int x){

        int toplam=0;
        for (int i = 0; i <=x ; i++) {
            toplam+=i;
        }
        return toplam;
    }

    //funktional programming
    public static int topla(int x){
        System.out.println();
        return IntStream.range(1,x+1). // 1 2 3 .... x elemanlarinin akisi---->1 dahil x+1 haric
                sum();
    }
    public static int topla1(int x){
        System.out.println();
        return IntStream.rangeClosed(1,x). // 1 2 3 .... x elemanlarinin akisi
                sum();
    }

//TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir program yaziniz
    public static int toplaCift(int x){
        System.out.println();
        return IntStream.rangeClosed(1,x). // 1 2 3 .... x elemanlarinin akisi
            filter(t->t%2==0).
            sum();
    }


//TASK 03 --> Ilk x pozitif cift sayiyi toplayan program yaziniz
    public static int toplaCift1(int x){
        System.out.println();
     return IntStream.iterate(2,t->t+2). // 2 4 6  .... x elemanlarinin akisi
            limit(x).// x'e kadar cift sayilar
            sum();
    }

//TASK 04 --> Ilk X pozitif tek tamsayiyi toplayan programi yaziniz
    public static int toplaTekSayi(int x){
        System.out.println();
        return IntStream.iterate(1,t->t+2).limit(x).sum();
    }

//TASK 05 --> 2'nin ilk x kuvvetini ekrana yazdiran programi yaziniz----> 2,4,8,16....
    public static void ikiIlkXKuvvet(int x){
        System.out.println();
         IntStream.iterate(2,t->t*2).limit(x).forEach(System.out::print);
    }

    //TASK 06 --> Istenilen bir sayinin ilk x kuvvetini ekrana yazdiran programi yaziniz---->3 nin ilk iki kuvveti
    public static void istenenSayiIlkKuvvet(int x, int a){
        System.out.println();
         IntStream.iterate(a,t->t*a).limit(x).forEach(System.out::print);
    }

    //TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan programi yaziniz
    public static int istenenSayiFaktoriyel(int x){
     System.out.println();
     return  IntStream.rangeClosed(1,x).// sinirlari belli 1 den x e kadar akis
             reduce(1,(t,u)->t*u);
    }


    //task08 ---> istenen bir sayinni x. kuvvetini ekrana yazdiran programi yaziniz
    public static int istenenSayiXinciKuvvet(int a, int x){
        System.out.println();
         return  IntStream.iterate(a,t->t*a).limit(x).reduce(0,(t,u)->u);
    }
}
