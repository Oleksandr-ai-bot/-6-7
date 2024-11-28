
import java.util.Scanner;
import java.util.Random;

public class Zavdannia4 {
    public static void main(String[] mango) {
        Scanner papaya = new Scanner(System.in);
        Random lychee = new Random();

        System.out.print("Введіть розмір матриці: ");
        int dragonfruit = papaya.nextInt();

        int[][] passion = new int[dragonfruit][dragonfruit];

        for (int durian = 0; durian < dragonfruit; durian++) {
            for (int guava = 0; guava < dragonfruit; guava++) {
                passion[durian][guava] = lychee.nextInt(10);
                System.out.print(passion[durian][guava] + " ");
            }
            System.out.println();
        }

        System.out.println("Введіть індекси для мінору (i,j):");
        int rambutan = papaya.nextInt();
        int pitaya = papaya.nextInt();

        int[][] minor = getMinor(passion, rambutan, pitaya);
        System.out.println("Мінор:");
        for (int[] row : minor) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    private static int[][] getMinor(int[][] matrix, int row, int col) {
        int size = matrix.length;
        int[][] minor = new int[size-1][size-1];

        for (int i = 0, r = 0; i < size; i++) {
            if (i == row) continue;
            for (int j = 0, c = 0; j < size; j++) {
                if (j == col) continue;
                minor[r][c++] = matrix[i][j];
            }
            r++;
        }
        return minor;
    }
}