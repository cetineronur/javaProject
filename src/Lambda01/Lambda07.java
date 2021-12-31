package Lambda01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Lambda07 {
    public static void main(String[] args) throws IOException {
        //TASK 01 --> haluk.txt dosyasini okuyunuz.(Console'a yazdiriniz)
        System.out.println("\n*** haluk.txt dosyasini okuyunuz -->  ");
        Files.lines(Paths.get("src/Lambda01/haluk.txt")).// file'a erisip file satirlari akisa alindi.
                forEach(System.out::println);

        //TASK 02 --> haluk.txt dosyasini buyuk harflerle okuyunuz.(Console'a buyuk harflerle yazdiriniz)
        System.out.println("\n*** haluk.txt dosyasini buyuk harflerle okuyunuz -->  ");
        Files.lines(Paths.get("src/Lambda01/haluk.txt")).
                map(t->t.toUpperCase()).//tum satirlar buyuk harf yapildi
                forEach(System.out::println);

        //TASK 03 --> haluk.txt dosyasindaki ilk satiri kucuk harflerle yazdiriniz.
        System.out.println("\n*** haluk.txt dosyasindaki ilk satiri kucuk harflerle okuyunuz 01 -->  ");
        Files.lines(Paths.get("src/Lambda01/haluk.txt")).
                limit(1).map(String::toLowerCase).
                forEach(System.out::println);


        //TASK 04 --> haluk.txt dosyasinda "basari" kelimesinin kac satirda gectiginiz yazdiriniz
        System.out.println("\n*** haluk.txt dosyasinda basari kelimesinin kac satirda gectiginiz yazdiriniz -->  ");
        System.out.println(Files.lines(Paths.get("src/Lambda01/haluk.txt")).
                filter(t -> t.contains("basari")).//basari icerme sarti
                        count());// sayisi

        //TASK 05 --> haluk.txt dosyasindaki farkli kelimeleri  yazdiriniz.
        System.out.println("\n*** haluk.txt dosyasindaki farkli kelimeleri  yazdiriniz. -->  ");
        System.out.println(Files.lines(Paths.get("src/Lambda01/haluk.txt")).
                map(t -> t.split(" ")).// " " gore satirlardaki elemanlari parcalayip array'a atadi.
                flatMap(Arrays::stream).//Arrays clasindan stream() ile array elemanlarindan yeni bir akis olustu.
                distinct().// yeni akistaki array elemanlari tekrarsiz hale getirildi.
                toList());//yeni akistaki array tekrarsiz elemanlari liste atandi


        //TASK 06 --> haluk.txt dosyasindaki tum kelimeleri natural order  yazdiriniz.
        System.out.println("\n*** haluk.txt dosyasindaki tum kelimeleri natural order  yazdiriniz. -->  ");
        System.out.println(Files.lines(Paths.get("src/Lambda01/haluk.txt")).map(t -> t.toLowerCase().split(" ")).
                flatMap(Arrays::stream).sorted().toList());


        //TASK 07 --> haluk.txt dosyasinda "basari" kelimesinin kac kere gectigini buyuk harf kucuk harf bagımsız yaziniz.
        System.out.println("\n*** haluk.txt dosyasinda basari kelimesinin kac kere gectigini  yazdiriniz. -->  ");
        System.out.println(Files.lines(Paths.get("src/Lambda01/haluk.txt")).map(t -> t.split(" ")).flatMap(Arrays::stream).filter(t -> t.equals("onur")).count());


        //TASK 08 --> haluk.txt dosyasinda "a" harfi gecen kelimelerin sayisini ekrana yazdiran programi yaziniz
        System.out.println("\n*** haluk.txt dosyasinda a harfi gecen kelimelerin sayisini ekrana yazdiran programi yazdiriniz. -->  ");
        System.out.println(Files.lines(Paths.get("src/Lambda01/haluk.txt")).map(t -> t.split(" ")).flatMap(Arrays::stream).filter(t -> t.contains("a")).count());


        //TASK 09 --> haluk.txt dosyasinda icinde "a" harfi gecen kelimeleri yazdiriniz
        System.out.println("\n*** haluk.txt dosyasinda a harfi gecen kelimeler yazdiriniz. -->  ");
        System.out.println(Files.lines(Paths.get("src/Lambda01/haluk.txt")).map(t -> t.split(" ")).flatMap(Arrays::stream).filter(t -> t.contains("a")).toList());


        //TASK 10 --> haluk.txt dosyasinda kac /farklı harf kullanildigini yazdiriniz
        System.out.println("\n*** haluk.txt dosyasinda kac /farklı harf kullanildigini  yazdiriniz. -->  ");
        System.out.println(Files.lines(Paths.get("src/Lambda01/haluk.txt")).map(t -> t.replaceAll("\\W", "").replaceAll("\\d", "").split("")).flatMap(Arrays::stream).distinct().count());


        //TASK 11 --> haluk.txt dosyasinda kac farkli kelime kullanildigini yazdiriniz
        System.out.println("\n*** haluk.txt dosyasinda kac farkli kelime kullanildigini  yazdiriniz. -->  ");
        System.out.println(Files.lines(Paths.get("src/Lambda01/haluk.txt")).map(t -> t.replaceAll("[.!?,\\-]", "").split(" ")).flatMap(Arrays::stream).distinct().count());

    }

}
