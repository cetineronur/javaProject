package Tag20;

import java.util.Scanner;

public class ff {

	public static void main(String[] args) {
		System.out.print("Bir tamsayi giriniz: ");
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            System.out.println("Sayi bir tamsayi, tebrikler!!");
            int sayi = scanner.nextInt();
            desenYazdir(sayi);
        } else {
            System.out.println("Sayi bir tamsayi degil!!!!");
            System.out.println("Tamsayi gir tamsayi!!!!!");
            scanner.nextLine();
            while (!scanner.hasNextInt()) {
                System.out.println("Tamsayi istiyoruz mankafa!!!");
                scanner.nextLine();
            }
            System.out.println("Tebrikler mankafa sonunda bir tamsayi girebildin!!!!");
            int sayi = Integer.parseInt(scanner.nextLine());
            desenYazdir(sayi);
        }
    }
    public static void desenYazdir(int sayi) {
        int m = 1;
        for (int j = 1; j <= sayi; j++) {
            for (int k = 0; k < j; k++) {
                System.out.print(m + " ");
                m += 1;
            }
            System.out.println();
            m = 1;
        }
    }
}

