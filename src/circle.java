import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter r ");
        int r = scanner.nextInt();
        System.out.println("Enter a ");
        int a = scanner.nextInt();
        System.out.println("Enter b ");
        int b = scanner.nextInt();
        int num1 = (r * r);
        int num2 = (((a * a) + (b * b)) / 4);
        if ( num1 >= num2) {
            System.out.println("true");
        }  else {
            if (num1 < num2) {
                System.out.println ("false");
            }
        }
    }
}