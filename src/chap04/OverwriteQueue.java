package chap04;

import java.util.Scanner;

class OverwriteQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("maximum number of elements: ");
        final int MAX = scanner.nextInt();
        int[] queue = new int[MAX];
        int cnt = 0;
        int retry;

        System.out.println("Enter a number.");

        do {
            System.out.printf("%dth number: ", cnt + 1);
            queue[cnt++ % MAX] = scanner.nextInt();

            System.out.print("Countinue?  (1) yes  (0) no : ");
            retry = scanner.nextInt();
        } while (retry == 1);

        int i = cnt - MAX;
        if (i < 0) i = 0;

        for (; i < cnt; i++) {
            System.out.printf("%dth number = %d\n", i + 1, queue[i % MAX]);
        }
    }
}
