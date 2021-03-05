import java.util.Scanner;

public class nxn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N ");
        int N = scanner.nextInt();
        int[][] a = new int[N][N];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < a.length; i++, System.out.println()) {
            for (int j = 0; j < a[i].length; j++) {

                    if (a[i][j] % 2 == 1) {
                        a[i][j] = 1;
                    }  else {
                        a[i][j] = 0; }
                System.out.print(a[i][j] + " ");
                }
            }
        }
    }
