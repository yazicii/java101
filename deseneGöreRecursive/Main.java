package Java101.deseneGöreRecursive;

import java.util.Scanner;

public class Main {

    static boolean design(int a, int b) {
        System.out.print(a + " ");
        if (a <= 0) {
            while (a != b) {
                a += 5;
                System.out.print(a + " ");
            }
            return true;
        }
        if (a > 0) {
            a -= 5;
        }
        return design(a, b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz:");
        int num = scan.nextInt();
        System.out.print("N Sayısı: " + num + "\n" + "Çıktısı: ");
        design(num, num);
    }

}
