package hw_2;

import java.util.Scanner;

public class Aneba {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Количество часов: ");
        int x = scan.nextInt();
        int res = 1;

        for (int i = 0; i < x / 3; ++i) {
            res *= 2;
        }

        System.out.printf("За %d часов получится %d амеб.", x, res);
    }
}
