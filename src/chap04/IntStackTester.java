package chap04;

import java.util.Scanner;

class IntStackTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntStack stk = new IntStack(64);

        while (true) {
            System.out.println();
            System.out.printf("Stack Status: %d / %d\n", stk.size(), stk.getCapacity());
            System.out.print("(1) push  (2) pop  (3) peek  (4) dump  (0) exit: ");

            int menu = scanner.nextInt();
            if (menu == 0) break;

            int x;
            switch (menu) {
                case 1:
                    System.out.print("data: ");
                    x = scanner.nextInt();

                    try {
                        stk.push(x);
                    } catch (StackOverflowError e) {
                        System.out.println("Stack is full.");
                    }

                    break;

                case 2:
                    try {
                        x = stk.pop();
                        System.out.printf("Popped data is %d\n", x);
                    } catch (EmptyStackException e) {
                        System.out.println("Stack is empty.");
                    }

                    break;

                case 3:
                    try {
                        x = stk.peek();
                        System.out.printf("Peeked data is %d\n", x);
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
