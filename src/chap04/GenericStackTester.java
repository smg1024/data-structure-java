package chap04;

import java.util.Scanner;

class GenericStackTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GenericStack<String> stk = new GenericStack<>(64);

        while (true) {
            System.out.println();
            System.out.printf("Stack Status: %d / %d\n", stk.size(), stk.getCapacity());
            System.out.print("(1) push  (2) pop  (3) peek  (4) dump  (0) exit: ");

            int menu = scanner.nextInt();
            if (menu == 0) break;

            String x;
            switch (menu) {
                case 1:
                    System.out.print("data: ");
                    x = scanner.next();

                    try {
                        stk.push(x);
                    } catch (StackOverflowError e) {
                        System.out.println("Stack is full.");
                    }

                    break;

                case 2:
                    try {
                        x = stk.pop();
                        System.out.printf("Popped data is %s\n", x);
                    } catch (EmptyStackException e) {
                        System.out.println("Stack is empty.");
                    }

                    break;

                case 3:
                    try {
                        x = stk.peek();
                        System.out.printf("Peeked data is %s\n", x);
                    } catch (EmptyStackException e) {
                        System.out.println("Stack is empty.");
                    }

                    break;

                case 4:
                    stk.dump();
                    break;
            }
        }
    }
}
