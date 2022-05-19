package Java101;

import java.util.Scanner;

public class EbobAndEkok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("n1 sayısını giriniz: ");
        int n1 = scan.nextInt();
        System.out.print("n2 sayısını giriniz: ");
        int n2 = scan.nextInt();
        int i = 0, ebob = 0, k = 0;

        int bigN;
        if (n1 > n2){
            bigN = n1;
        }else {
            bigN = n2;
        }
        while (i <= bigN){
            i++;
            if ( n1 % i == 0 && n2 % i == 0){
                ebob = i;
            }
        }
        System.out.println(ebob);

        while (k <= (n1 * n2) ){
            k++;
            if (k % n1 == 0 && k % n2 == 0){
                System.out.println(k);
                break;
            }
        }

        /*
        int ebob = 1;
        for (int i = 1; i<= bigN; i++){
            if (n1 % i == 0 && n2 % i == 0){
                ebob = i;
            }

        }
        System.out.println(ebob);*/
        /*for (int k = bigN; k >= 1; k--){
            if (n1 % k == 0 && n2 % k == 0){
                System.out.println(k);
                break;
            }
        }
        System.out.println("**********");
        for (int a = 1; a <= (n1 * n2); a++){
            if (a % n1 == 0 && a % n2 == 0){
                System.out.println(a);
                break;
            }
        }*/

    }
}
