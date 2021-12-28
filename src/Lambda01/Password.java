package Lambda01;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {


    public static void main(String[] args) {

        sifreOlusturma();

    }

    public static void sifreOlusturma() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Sifreyi giriniz: ");
        String password = scan.nextLine();

        if (password.length()<8) {

            System.out.println("Girdiginiz sifre en az 8 karakterden olusmali!");
            sifreOlusturma();
        }

        if (password==null || password.trim().isEmpty() ) {

            System.out.println("Yanlis bir format girdiniz!");
            System.out.println("Tekrar deneyiniz: ");
            sifreOlusturma();
        }
        integerVarMi(password);
        buyukHarfVarMi(password);
        kucukHarfVarMi(password);
        ozelkarakterVarMi(password);

        System.out.println("Tebrikler!\nSifreniz basariyla kaydedildi"+password);
        System.out.println();
    }

    public static void integerVarMi(String password) {
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(password);
        boolean varMi = matcher.find();

        if (!varMi) {
            System.out.println("Sifrede en az bir rakam olmali! ");
            sifreOlusturma();

        }

    }

    public static void buyukHarfVarMi(String password) {
        Pattern pattern = Pattern.compile("[A-Z]");
        Matcher matcher = pattern.matcher(password);
        boolean varMi = matcher.find();

        if (!varMi) {
            System.out.println("Sifrede en az bir buyuk karakter olmali! ");
            sifreOlusturma();

        }

    }

    public static void kucukHarfVarMi(String password) {
        Pattern pattern = Pattern.compile("[a-z]");
        Matcher matcher = pattern.matcher(password);
        boolean varMi = matcher.find();

        if (!varMi) {
            System.out.println("Sifrede en az bir kucuk karakter olmali! ");
            sifreOlusturma();

        }

    }

    public static void ozelkarakterVarMi(String password) {

        Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
        Matcher matcher = pattern.matcher(password);
        boolean varMi = matcher.find();

        if (!varMi) {
            System.out.println("Sifrede en az bir ozel karakter olmali! ");
            sifreOlusturma();

        }

    }

}
