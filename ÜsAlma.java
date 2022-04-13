package Java101;

import java.util.Scanner;

public class ÜsAlma {
    public static void main(String[] args) {
        int n, k,  total=1;
        Scanner input =new Scanner(System.in);

        System.out.print("Üssü alaınacak sayı: ");
        n = input.nextInt();

        System.out.print("Üs olacak sayı: ");
        k = input.nextInt();

        for (int i = 1; i<=k; i++){
            total *= n;
        }
        System.out.println(total);
    }

}
