package Java101;

import java.util.Scanner;

public class SayilarinEnBüyükVeKücükleri {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz:");
        int n = scan.nextInt();

        int maks = 0;
        int min = 0;

        for (int i = 1; i<=n; i++){
            System.out.print(i+"Sayıyı giriniz:");
            int k = scan.nextInt();
            if (i == 1 ){
                maks = k;
                min = k;
            }
            if (k > maks){
                maks = k;
            }
            if (k < min){
                min = k;
            }

        }
        System.out.println(maks);
        System.out.println(min);

    }
}
