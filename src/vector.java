import java.util.Random;

public class vector {
    public static void main(String[] args) {
        final int n = 4;
        Random random = new Random();

        double[] array = new double[n];
        double max =Integer.MIN_VALUE;
        double min =Integer.MAX_VALUE ;
        double maxIndex = -1, minIndex = -1;
        double sum = 0;
        double product = 1;
        for (int i = 0; i < n; ++i) {
            array[i] = (random.nextInt(1000)-500)*0.01;
            System.out.print(array[i] + " ");
            if (array[i] < 0) sum += array[i];

            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        System.out.println();
        if (maxIndex > minIndex) {
            maxIndex = maxIndex + minIndex;
            minIndex = maxIndex - minIndex;
            maxIndex = maxIndex - minIndex;
        }
        for (double i = maxIndex + 1; i < minIndex; ++i) {
            product *= array[(int) i];
        }
        System.out.println("min: " + sum);
        System.out.println("min*max: " + product);
    }
}