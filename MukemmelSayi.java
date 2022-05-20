package Java101;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int n = scan.nextInt();
        int total = 0;


        for (int i = 1; i < n; i++){
            if (n % i == 0){
                total+=i;
            }
        }
        if (n == total){
            System.out.println(n+" Mükemmel sayıdır");
        }else {
            System.out.println(n+" Mükemmel sayı değildir");
        }

    }
}
