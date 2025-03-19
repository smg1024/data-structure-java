package chap05;

import java.util.Scanner;

class EuclidGCD {
    static int gcd(int x, int y) {
        if (y == 0) return x;
        else return gcd(y, x % y);
    }

    static int gcdArray(int[] a) {
        int result = gcd(a[0], a[1]);

        for (int i = 2; i < a.length; i++) {
            result = gcd(result, a[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Euclid Greatest Common Denominator");

        System.out.print("Number 1: ");
        int x = scanner.nextInt();
        System.out.print("Number 2: ");
        int y = scanner.nextInt();

        System.out.println("gcd(x, y) = " + gcd(x, y));

        int[] a = {6, 15, 96, 1254};
        System.out.println("gcdArray(a) = " + gcdArray(a));
    }
}
