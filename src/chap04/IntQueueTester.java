package chap04;

import java.util.Scanner;

class IntQueueTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntQueue queue = new IntQueue(64);

        while (true) {
            System.out.println();
            System.out.printf("Queue Status: %d / %d\n", queue.size(), queue.getCapacity());
            System.out.print("(1) en-queue  (2) de-queue  (3) peek  (4) dump  (5) orderOf  (0) exit: ");

            int menu = scanner.nextInt();
            if (menu == 0) break;

            int x;
            switch (menu) {
                case 1:
                    System.out.print("data: ");
                    x = scanner.nextInt();

                    try {
                        queue.enqueue(x);
                    } catch (StackOverflowError e) {
                        System.out.println("Stack is full.");
                    }

                    break;

                case 2:
                    try {
                        x = queue.dequeue();
                        System.out.printf("Popped data is %d\n", x);
                    } catch (EmptyStackException e) {
                        System.out.println("Stack is empty.");
                    }

                    break;

                case 3:
                    try {
                        x = queue.peek();
                        System.out.printf("Peeked data is %d\n", x);
                    } catch (EmptyStackException e) {
                        System.out.println("Stack is empty.");
                    }

                    break;

                case 4:
                    queue.dump();
                    break;

                case 5:
                    System.out.print("data: ");
                    x = scanner.nextInt();
                    int order = queue.orderOf(x);
                    if (order < 0) System.out.printf("%d does not exist.\n", x);
                    else System.out.printf("%d is in %dth order.\n", x, order);
            }
        }
    }
}
