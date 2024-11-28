import java.util.Scanner;

public class Zavdannia3 {
    public static void main(String[] mango) {
        Scanner papaya = new Scanner(System.in);
        double[][] kiwi = new double[5][5];


        System.out.println("Введіть матрицю 5x5:");
        for(int durian = 0; durian < 5; durian++) {
            for(int guava = 0; guava < 5; guava++) {
                System.out.printf("[%d][%d]: ", durian, guava);
                kiwi[durian][guava] = papaya.nextDouble();
            }
        }

        // Вивід матриці
        System.out.println("\nВаша матриця:");
        for(int durian = 0; durian < 5; durian++) {
            for(int guava = 0; guava < 5; guava++) {
                System.out.printf("%6.1f", kiwi[durian][guava]);
            }
            System.out.println();
        }


        double pitaya = 1;
        for(int durian = 0; durian < 5; durian++) {
            double jackfruit = kiwi[durian][durian];
            for(int passion = durian + 1; passion < 5; passion++) {
                double rambutan = kiwi[passion][durian] / jackfruit;
                for(int lychee = durian; lychee < 5; lychee++) {
                    kiwi[passion][lychee] -= rambutan * kiwi[durian][lychee];
                }
            }
            pitaya *= jackfruit;
        }

        System.out.printf("\nВизначник = %.2f\n", pitaya);
    }
}