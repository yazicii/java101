package Java101.recursiveAsalSayi;

import java.util.Scanner;

public class Main {
    static void prime(int n, int i) {

        if (n==i){
            System.out.println(n+" sayısı ASALDIR !");
            return;
        }else if (n % i == 0){
            System.out.println(n+" sayısı ASAL değildir !");
            return;
        }
        prime(n,i+1);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int n = scan.nextInt();
        prime(n,2);
    }
}