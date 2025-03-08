package chap01;

import java.util.Scanner;

public class TriangleLB {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("왼쪽 아래가 직각인 이등변삼각형을 출력합니다.");

        do {
            System.out.print("몇 단 삼각형입니까? ");
            n = stdIn.nextInt();
        } while (n <= 0);

        triangleLB(n);
        triangleLU(n);
        triangleRU(n);
        triangleRB(n);
        starPyramid(n);
        numberPyramid(n);
    }

    static void triangleLB(int n) {
        System.out.println("------triangleLB------");
        for (int i = 1; i <= n; i++) {
            System.out.println("*".repeat(i));
        }
    }

    static void triangleLU(int n) {
        System.out.println("------triangleLU------");
        for (int i = n; i >= 1; i--) {
            System.out.println("*".repeat(i));
        }
    }

    static void triangleRU(int n) {
        System.out.println("------triangleRU------");
        for (int i = n; i >= 1; i--) {
            System.out.print(" ".repeat(n - i));
            System.out.print("*".repeat(i));
            System.out.println();
        }
    }

    static void triangleRB(int n) {
        System.out.println("------triangleRB------");
        for (int i = 1; i <= n; i++) {
            System.out.print(" ".repeat(n - i));
            System.out.print("*".repeat(i));
            System.out.println();
        }
    }

    static void starPyramid(int n) {
        System.out.println("------starPyramid------");
        for (int i = 1; i <= n; i++) {
            System.out.print(" ".repeat(n - i));
            System.out.print("*".repeat(i));
            System.out.print("*".repeat(i - 1));
            System.out.println();
        }
    }

    static void numberPyramid(int n) {
        System.out.println("------numberPyramid------");
        for (int i = 1; i <= n; i++) {
            String num = String.valueOf(i % 10).repeat(i * 2 - 1);

            System.out.print(" ".repeat(n - i));
            System.out.printf(num);
            System.out.println();
        }
    }
}
