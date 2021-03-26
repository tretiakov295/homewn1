package hw_2;

public class Kilometers {
    public static void main(String[] args) {
        double a = 10.0D;
        double sum = 0.0D;

        for (int day = 1; day < 8; ++day) {
            sum += a;
            if (day == 7) {
                System.out.println(sum);
            }

            a += a * 0.1D;
        }

    }
}


