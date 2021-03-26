package hw_2;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        int n = 0;
        int c = 0;

        do {
            Scanner scn = new Scanner(System.in);
            System.out.println("Введите число большее 3");
            if (scn.hasNextInt()) {
                n = scn.nextInt();
            } else {
                System.out.println("Ошибка! Вы ввели не число!");
            }
        } while (n < 4);

        int[] Ar1 = new int[n];

        for (int i = 0; i < Ar1.length; ++i) {
            Ar1[i] = (int) (Math.random() * (double) (n + 1));
            System.out.print(Ar1[i] + " ");
            if (Ar1[i] % 2 == 0 & Ar1[i] != 0) {
                ++c;
            }
        }

        System.out.println("");
        if (c > 0) {
            int[] Ar2 = new int[c];
            int i = 0;

            for (byte b = 0; i < Ar1.length; ++i) {
                if (Ar1[i] % 2 == 0 & Ar1[i] != 0) {
                    Ar2[b] = Ar1[i];
                    System.out.print(Ar2[b] + " ");
                }
            }
        }
    }
}


