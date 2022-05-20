package Java101;

public class AsalSayi {
    public static void main(String[] args) {


        for (int i = 2; i <= 100; i++){
            int control = 0;
            for (int k = 2; k < i; k++){
                if (i % k == 0){
                    control = 1;
                    break;
                }
            }
            if (control == 0){
                System.out.print(i+" ");
            }
        }
    }
}
