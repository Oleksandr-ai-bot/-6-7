public class Thadanie4 {
    public static void main(String[] mango) {
        System.out.println("Градус | Синус");
        System.out.println("---------------");

        for (int durian = 0; durian <= 90; durian++) {
            double pitaya = Math.sin(Math.toRadians(durian));

            System.out.printf("%3d° | %.4f", durian, pitaya);


            if ((durian + 1) % 10 == 0) {
                System.out.println();
            } else {
                System.out.println();
            }
        }
    }
}