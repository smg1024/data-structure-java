package chap01;

import java.util.Scanner;

public class PrintStars2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n, w;

        System.out.println("*개를 출력하되 w개마다 줄을 바꿔서 출력합니다.");

        do {
            System.out.println("n: ");
            n = stdIn.nextInt();
        } while (n <= 0);

        do {
            System.out.println("w: ");
            w = stdIn.nextInt();
        } while (w <= 0 || w > n);

        for (int i = 0; i < n / w; i++) {
            System.out.println("*".repeat(w));
        }

        int rest = n % w;
        if (rest != 0) System.out.println("*".repeat(rest));
    }
}
