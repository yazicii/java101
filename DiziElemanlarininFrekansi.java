package Java101;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DiziElemanlarininFrekansi {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Dizi Boyutu: ");
        int n = scan.nextInt();
        int[] list = new int[n];

        for (int i = 0; i<list.length;i++){
            System.out.print((i+1) +" Elemanını Giriniz : " );
            list[i]= scan.nextInt();
        }

        Map<Integer, Integer> frekans = new HashMap<>();

        for (int i = 0; i< n;i++){
            int eleman = list[i];
            if (frekans.containsKey(eleman)){
                frekans.put(eleman,frekans.get(eleman) + 1);
            }else {
                frekans.put(eleman, 1);
            }
        }
        System.out.println("Dizi : "+ Arrays.toString(list));
        System.out.println("Tekrar Sayışarı");
        for (Map.Entry<Integer, Integer> entry : frekans.entrySet()){
            System.out.println(entry.getKey()+ " sayısı " + entry.getValue() + " kere tekrar edildi.");

        }
    }
}
