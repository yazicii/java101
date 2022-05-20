package Java101;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Fibonacci serisi kaç elamanlı olsun : ");
        int n = scan.nextInt();

        int a = 0, b = 1, c;

        System.out.print(a);
        System.out.print(" "+b);

        for (int i = 0; i < n-1; i++){
            c = a + b;
            a = b;
            b = c;
            System.out.print(" "+c);
        }


    }
}
