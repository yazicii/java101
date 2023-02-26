package Java101;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {

    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(100);
        Scanner scan = new Scanner(System.in);
        int selected;
        int right = 0;
        boolean isWin = false;
        boolean isWrong = false;
        int[] wrong = new int[5];

        System.out.println(number);

        while (right < 5) {

            System.out.print("Lütfen tahmininizi giriniz : ");
            selected = scan.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasında sayı değeri giriniz.");

                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak: " + (5 - right));

                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde haklanızdan düşülecektir!!");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Tebrikler, Doğru tahmin... Tahmin ettiğiniz sayı = " + selected);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı bir sayı girdiniz.");
                if (selected > number) {
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");
                }
                wrong[right++] = selected;

                System.out.println("Kalan hak : " + (5 - right));

            }

        }

        if (!isWin) {
            System.out.println("Kaybettiniz ! :(");
            System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
        }

    }

}