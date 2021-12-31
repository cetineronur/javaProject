package lambdaPractise.proje;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

   static List<Ogrenci> ogList = new ArrayList<>();
    public static void main(String[] args) {
        ogrenciListesi();
        notaGoreSirala(3,5);
        ogrenciYasSirala();
        belirlibirYasVeCinsiyetSirala(24,"kadin");
        ismeGOreYazdir("Ahmet");
        soyIsmeGoreSirala("Can");
        cinsiyetGoreSirala("erkek","kadin");
        System.out.println(ortHesapla());

    }

    private static void cinsiyetGoreSirala(String cinsiyet,String cinsiyet1) {
        System.out.println();
        System.out.println(ogList.stream().filter(t -> t.getCinsiyet().equalsIgnoreCase(cinsiyet)).toList());
        System.out.println();
        System.out.println(ogList.stream().filter(t -> t.getCinsiyet().equalsIgnoreCase(cinsiyet1)).toList());
    }

    private static double ortHesapla() {
        System.out.println();
        double toplam = ogList.stream().mapToDouble(Ogrenci::getDiplomaNotu).reduce(0.0,Double::sum);
              return toplam/ogList.size();


    }

    private static void soyIsmeGoreSirala(String soyad) {
        System.out.println();
        ogList.stream().filter(t->t.getSoyAd().equalsIgnoreCase("soyad")).toList().forEach(System.out::println);
    }

    private static void ismeGOreYazdir(String isim) {
        System.out.println();
        System.out.println(ogList.stream().filter(t -> t.getName().equals(isim)).toList());
    }

    private static void belirlibirYasVeCinsiyetSirala(int yas, String cinsiyet) {
        System.out.println();
        ogList.stream().filter(t->t.getYas()<yas).filter(t->t.getCinsiyet().equalsIgnoreCase(cinsiyet)).
                sorted(Comparator.comparing(Ogrenci::getYas)).forEach(System.out::println);
    }

    private static void ogrenciYasSirala() {
        System.out.println();
       ogList.stream().sorted(Comparator.comparing(Ogrenci::getYas)).forEach(System.out::println);
    }

    private static void notaGoreSirala(int alt, int ust) {
        ogList.stream().sorted(Comparator.comparing(Ogrenci::getDiplomaNotu).reversed()).
                skip(alt-1).limit(ust-alt+1).forEach(System.out::println);

    }

    private static void ogrenciListesi() {
        ogList.add(new Ogrenci("Ahmet","Can",30,95.5,"erkek"));
        ogList.add(new Ogrenci("Ahmet","Yarba",25,90.5,"erkek"));
        ogList.add(new Ogrenci("Ayse","Can",21,82.5,"kadin"));
        ogList.add(new Ogrenci("Merve","Aslan",30,98.8,"kadin"));
        ogList.add(new Ogrenci("Veli","Han",80,35.5,"erkek"));
        ogList.add(new Ogrenci("Funda","Funda",24,99.2,"kadin"));
    }
}
