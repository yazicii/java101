package Java101.metotlarHesapMakinesi;

import java.util.Scanner;

public class HesapMakinesi {
    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam = " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma = " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Çarpım =" + result);
        return result;
    }

    static double divided(int a, int b) {
        if (b == 0) {
            System.out.println("İkinci sayı 0'dan büyük olmalıdır.");
            return 0;
        }
        double result = a / b;
        System.out.println("Bölme = " + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 0;
        for (int i = 1; i <= b; i++) {
            result *= b;
        }
        return result;
    }

    static int mod(int a, int b) {
        return a % b;
    }

    static void calc(int a, int b) {
        System.out.println("Çevresi =" + (2 * (a + b)));
        System.out.println("Alanı =" + (a * b));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- çarpma İşlemi\n"
                + "4- Bölme İşlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Mod Alma\n"
                + "7- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0 Çıkış Yap";
        System.out.println(menu);
        while (true) {
            System.out.print("İşlem seçiniz: ");
            int select = scan.nextInt();
            if (select == 0) {
                break;
            }
            System.out.print("İlk sayı: ");
            int a = scan.nextInt();
            System.out.print("İkinci sayı: ");
            int b = scan.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divided(a, b);
                    break;
                case 5:
                    System.out.println("Üs işlemi =" + power(a, b));
                    break;
                case 6:
                    System.out.println("Mod işlemi = " + mod(a, b));
                    break;
                case 7:
                    calc(a,b);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz.");


            }

        }
        System.out.println("See you");

    }
}
