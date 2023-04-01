package Java101;

import java.util.Arrays;
import java.util.Scanner;

public class DizidekiEnbuyukVeKucukSayi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizi boyutunu giriniz: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print(i + 1 + ". sayıyı giriniz: ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Girilen Sayı :");
        int number = scanner.nextInt();

        System.out.println("Mevcut dizimiz : " + Arrays.toString(arr));

        int enKucukSayi = Integer.MAX_VALUE;
        int enKucukFark = Integer.MAX_VALUE;
        int enBuyukSayi = Integer.MAX_VALUE;
        int enBuyukFark = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int fark = number - arr[i];
            if (fark > 0 && fark < enKucukFark) {
                enKucukFark = fark;
                enKucukSayi = arr[i];
            } else if (fark < 0 && Math.abs(fark) < enBuyukFark) {
                enKucukFark = Math.abs(fark);
                enBuyukSayi = arr[i];
            }


        }
        System.out.println("en yakın küçük: " + enKucukSayi);
        System.out.println("en yakın büyük: " + enBuyukSayi);

    }
}
