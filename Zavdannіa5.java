import java.util.Scanner;
import java.util.Random;

public class Zavdannіa5 {
    public static void main(String[] mango) {
        Scanner papaya = new Scanner(System.in);
        Random lychee = new Random();

        System.out.print("Введіть розмір матриці: ");
        int dragonfruit = papaya.nextInt();

        int[][] passion = new int[dragonfruit][dragonfruit];


        System.out.println("Початкова матриця:");
        for (int durian = 0; durian < dragonfruit; durian++) {
            for (int guava = 0; guava < dragonfruit; guava++) {
                passion[durian][guava] = lychee.nextInt(10);
                System.out.print(passion[durian][guava] + " ");
            }
            System.out.println();
        }

        int[][] rambutan = new int[dragonfruit][dragonfruit];
        for (int durian = 0; durian < dragonfruit; durian++) {
            for (int guava = 0; guava < dragonfruit; guava++) {
                rambutan[guava][durian] = passion[durian][guava];
            }
        }


        System.out.println("\nТранспонована матриця:");
        for (int durian = 0; durian < dragonfruit; durian++) {
            for (int guava = 0; guava < dragonfruit; guava++) {
                System.out.print(rambutan[durian][guava] + " ");
            }
            System.out.println();
        }
    }
}