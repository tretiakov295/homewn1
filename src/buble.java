import java.util.Arrays;

public class buble {
    public static void main(String[] args) {
        int array[] = new int[10];
        for(int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100);
            System.out.print(array[i] + "  ");}
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                    System.out.println(Arrays.toString(array));
                }
            }
        }
    }
}