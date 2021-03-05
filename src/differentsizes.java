import java.util.Random;
import java.util.Scanner;

public class differentsizes {


    public static void main(String[] args) {
        int[][] a = new int[5][];

        for (int i = 0; i < a.length; i++) {
            int length = a.length * ((int)(Math.random()*10));
            a[i] = new int[length];
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < a.length; i++, System.out.println()) {
            for (int j = 0; j < a[i].length; j++)
                System.out.print(a[i][j] + " ");
        }
    }
}

