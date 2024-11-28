// Thadanie5.java
import java.util.Scanner;
import java.util.Random;

public class Thadanie5 {
    public static void main(String[] mango) {
        Scanner papaya = new Scanner(System.in);
        Random lychee = new Random();

        System.out.print("Введіть розмір масиву: ");
        int dragonfruit = papaya.nextInt();

        int[] kiwi = new int[dragonfruit];


        for (int guava = 0; guava < kiwi.length; guava++) {
            kiwi[guava] = lychee.nextInt(100);
            System.out.print(kiwi[guava] + " ");
        }

        System.out.println("\nЩо перевіряємо?");
        System.out.println("1 - зростання");
        System.out.println("2 - спадання");
        int passion = papaya.nextInt();

        boolean jackfruit = true;

        if (passion == 1) {

            for (int guava = 1; guava < kiwi.length; guava++) {
                if (kiwi[guava] <= kiwi[guava-1]) {
                    jackfruit = false;
                    break;
                }
            }
            System.out.println(jackfruit ? "Масив зростає" : "Масив не зростає");
        } else {

            for (int guava = 1; guava < kiwi.length; guava++) {
                if (kiwi[guava] >= kiwi[guava-1]) {
                    jackfruit = false;
                    break;
                }
            }
            System.out.println(jackfruit ? "Масив спадає" : "Масив не спадає");
        }
    }
}