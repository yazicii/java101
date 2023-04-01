package Java101;

import java.util.Arrays;
import java.util.Scanner;

public class DiziElamanlariniSiralama {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dizinin boyutu : ");
        int n = scan.nextInt();
        int[] list = new int[n];

        System.out.println("Dizinin elemanlarını giriniz :");
        for (int i = 0; i < list.length; i++){
            System.out.print((i+1) + ". Elemenı : " );
            list[i]= scan.nextInt();
        }
        Arrays.sort(list);
        System.out.print("Sıralama: ");
        for (int i = 0; i<list.length;i++){
            System.out.print(list[i]+ " ");
        }
    }
}
