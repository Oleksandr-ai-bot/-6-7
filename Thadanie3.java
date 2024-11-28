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

    System.out.print("\nЯке число шукаємо? ");
    int passion = papaya.nextInt();

    System.out.print("На яке число замінюємо? ");
    int rambutan = papaya.nextInt();


    for (int guava = 0; guava < kiwi.length; guava++) {
        if (kiwi[guava] == passion) {
            kiwi[guava] = rambutan;
        }
    }

    System.out.println("\nНовий масив:");
    for (int i : kiwi) {
        System.out.print(i + " ");
    }
}