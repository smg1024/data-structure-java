package chap04;

import java.util.Scanner;

class GenericQueueTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GenericQueue<String> queue = new GenericQueue<>(64);

        while (true) {
            System.out.println();
            System.out.printf("Queue Status: %d / %d\n", queue.size(), queue.getCapacity());
            System.out.print("(1) en-queue  (2) de-queue  (3) peek  (4) dump  (5) orderOf  (0) exit: ");

            int menu = scanner.nextInt();
            if (menu == 0) break;

            String x;
            switch (menu) {
                case 1:
                    System.out.print("enqueue data: ");
                    x = scanner.next();

                    try {
                        System.out.printf("%s is enqueued.", queue.enqueue(x));
                    } catch (StackOverflowError e) {
                        System.out.println("Stack is full.");
                    }

                    break;

                case 2:
                    try {
                        x = queue.dequeue();
                        System.out.printf("Popped data is %s\n", x);
                    } catch (EmptyStackException e) {
                        System.out.println("Stack is empty.");
                    }

                    break;

                case 3:
                    try {
                        x = queue.peek();
                        System.out.printf("Peeked data is %s\n", x);
                    } catch (EmptyStackException e) {
                        System.out.println("Stack is empty.");
                    }

                    break;

                case 4:
                    queue.dump();
                    break;

                case 5:
                    System.out.print("search data: ");
                    x = scanner.next();
                    int order = queue.orderOf(x);
                    if (order < 0) System.out.printf("%s does not exist.\n", x);
                    else System.out.printf("%s is in %dth order.\n", x, order);
            }
        }
    }
}
