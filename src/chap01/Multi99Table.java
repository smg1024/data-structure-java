package chap01;

public class Multi99Table {
    public static void main(String[] args) {
        System.out.println("-----구구단 곱셈표------");

        System.out.print("   |");
        for (int a = 1; a <= 9; a++) {
            System.out.printf("%3d", a);
        }
        System.out.println("\n---+------------------------------");

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= 9; j++)
                System.out.printf("%3d", i * j);
            System.out.println();
        }

    }
}
