package Java101;
//Koç Burcu : 21 Mart - 20 Nisan
//Boğa Burcu : 21 Nisan - 21 Mayıs
//İkizler Burcu : 22 Mayıs - 22 Haziran
//Yengeç Burcu : 23 Haziran - 22 Temmuz
//Aslan Burcu : 23 Temmuz - 22 Ağustos
//Başak Burcu : 23 Ağustos - 22 Eylül
//Terazi Burcu : 23 Eylül - 22 Ekim
//Akrep Burcu : 23 Ekim - 21 Kasım
//Yay Burcu : 22 Kasım - 21 Aralık
//Oğlak Burcu : 22 Aralık - 21 Ocak
//Kova Burcu : 22 Ocak - 19 Şubat
//Balık Burcu : 20 Şubat - 20 Mart
//Ödev
//Aynı örneği switch-case kullanmadan yapınız.

import java.util.Scanner;

public class BurcProgrami<horoscope> {
    public static void main(String[] args) {
        int month, day;
        String horoscope = "";

        Scanner input = new Scanner(System.in);

        System.out.print("The month you were born :  ");
        month = input.nextInt();

        System.out.print("The day you were born : ");
        day = input.nextInt();

        if (month > 12) {
            System.out.println("Hatalı giriş yaptınız !!");
        }
        if (month == 1) {
            if (day < 22) {
                System.out.println("Burcunuz : oğlak ");
            } else if ((day > 22) && (day <= 32)) {
                System.out.println("Burcunuz : kova ");
            } else {
                System.out.println("Hatalı giriş yaptınız !! Tekrar Deneyiniz !");
            }
        } else if ((month == 2)) {
            if (day < 20) {
                System.out.println("Burcunuz : kova ");
            } else if ((day > 19) && (day >= 29)) {
                System.out.println("Burcunuz : balık ");
            } else {
                System.out.println("Hatalı giriş yaptınız !! Tekrar Deneyiniz !");
            }
        } else if ((month == 3)) {
            if (day < 21) {
                System.out.println("Burcunuz : balık ");
            } else if ((day > 20) && (day < 32)) {
                System.out.println("Burcunuz : koç ");
            } else {
                System.out.println("Hatalı giriş yaptınız !! Tekrar Deneyiniz !");
            }
        } else if ((month == 4)) {
            if (day < 21) {
                System.out.println("Burcunuz : koç ");
            } else if ((day > 20) && (day < 31)) {
                System.out.println("Burcunuz : boğa ");
            } else {
                System.out.println("Hatalı giriş yaptınız !! Tekrar Deneyiniz !");
            }
        } else if ((month == 5)) {
            if (day < 22) {
                System.out.println("Burcunuz : boğa ");
            } else if ((day > 21) && (day < 32)) {
                System.out.println("Burcunuz : ikizler ");
            } else {
                System.out.println("Hatalı giriş yaptınız !! Tekrar Deneyiniz !");
            }
        } else if ((month == 6)) {
            if (day < 23) {
                System.out.println("Burcunuz : ikizler ");
            } else if ((day > 22) && (day < 31)) {
                horoscope = "yengeç";
            } else {
                System.out.println("Hatalı giriş yaptınız !! Tekrar Deneyiniz !");
            }
        } else if ((month == 7)) {
            if (day < 23) {
                System.out.println("Burcunuz : yengeç ");
            } else if ((day > 22) && (day < 32)) {
                System.out.println("Burcunuz : aslan ");
            } else {
                System.out.println("Hatalı giriş yaptınız !! Tekrar Deneyiniz !");
            }
        } else if ((month == 8)) {
            if (day < 23) {
                System.out.println("Burcunuz : aslan ");
            } else if ((day > 22) && (day < 32)) {
                System.out.println("Burcunuz : başak ");
            } else {
                System.out.println("Hatalı giriş yaptınız !! Tekrar Deneyiniz !");
            }
        } else if ((month == 9)) {
            if (day < 23) {
                System.out.println("Burcunuz : başak ");
            } else if ((day > 22) && (day < 31)) {
                System.out.println("Burcunuz : terazi ");
            } else {
                System.out.println("Hatalı giriş yaptınız !! Tekrar Deneyiniz !");
            }
        } else if ((month == 10)) {
            if (day < 23) {
                System.out.println("Burcunuz : terazi ");
            } else if ((day > 22) && (day < 32)) {
                System.out.println("Burcunuz : akrep ");
            } else {
                System.out.println("Hatalı giriş yaptınız !! Tekrar Deneyiniz !");
            }
        } else if ((month == 11)) {
            if (day < 22) {
                System.out.println("Burcunuz : akrep ");
            } else if ((day > 21) && (day < 31)) {
                System.out.println("Burcunuz : yay ");
            } else {
                System.out.println("Hatalı giriş yaptınız !! Tekrar Deneyiniz !");
            }
        } else if ((month == 12)) {
            if (day < 22) {
                System.out.println("Burcunuz : yay ");
            } else if ((day > 21) && (day < 32)) {
                System.out.println("Burcunuz : oğlak ");
            }
        }
    }
}



