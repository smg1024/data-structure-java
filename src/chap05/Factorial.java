package chap05;

import java.util.Scanner;

class Factorial {
    static int factorial(int n) {
        if (n > 0) return n * factorial(n - 1);
        else return 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        int n = scanner.nextInt();

        System.out.println("factorial(n) = " + factorial(n));
    }
}
