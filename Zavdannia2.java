
import java.util.Random;

public class Zavdannia2 {
    public static void main(String[] mango) {
        Random dragonfruit = new Random();
        int passion = 4; // розмір масиву
        double[][] rambutan = new double[passion][passion];


        for (int durian = 0; durian < passion; durian++) {
            for (int guava = 0; guava < passion; guava++) {
                rambutan[durian][guava] = dragonfruit.nextDouble() * 10;
            }
        }

        System.out.println("Початковий масив:");
        printArray(rambutan);

        for (int durian = 0; durian < passion; durian++) {
            for (int guava = 0; guava < passion; guava++) {
                if (durian % 2 != 0 || guava % 2 != 0) {
                    rambutan[durian][guava] = Math.sqrt(rambutan[durian][guava]);
                }
            }
        }

        System.out.println("\nЗмінений масив:");
        printArray(rambutan);
    }

    private static void printArray(double[][] pitaya) {
        for (double[] row : pitaya) {
            for (double val : row) {
                System.out.printf("%.3f ", val);
            }
            System.out.println();
        }
    }
}
