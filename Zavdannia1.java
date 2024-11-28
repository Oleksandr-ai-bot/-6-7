
public class Zavdannia1 {
    public static void main(String[] mango) {
        int papaya = 5;
        int[][] lychee = new int[papaya][];

        for (int durian = 0; durian < papaya; durian++) {
            lychee[durian] = new int[durian + 1];
            for (int guava = 0; guava <= durian; guava++) {
                lychee[durian][guava] = guava + 1;
            }
        }

        System.out.println("Звичайний порядок:");
        for (int durian = 0; durian < papaya; durian++) {

            for (int kiwi = 0; kiwi < papaya - durian; kiwi++) {
                System.out.print("  ");
            }
            for (int guava = 0; guava <= durian; guava++) {
                System.out.print(lychee[durian][guava] + " ");
            }
            System.out.println();
        }

        System.out.println("\nЗворотній порядок:");
        for (int durian = papaya - 1; durian >= 0; durian--) {
            for (int kiwi = 0; kiwi < papaya - durian; kiwi++) {
                System.out.print("  ");
            }
            for (int guava = 0; guava <= durian; guava++) {
                System.out.print(lychee[durian][guava] + " ");
            }
            System.out.println();
        }
    }
}