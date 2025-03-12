package chap02;

import java.util.Scanner;

class CardinalConversion {
    final static String dChar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    static int cardConv(int x, int r, char[] d) {
        int digits = 0;

        do {
            d[digits++] = dChar.charAt(x % r);
            System.out.printf("x = %2d", x);
            System.out.println(" --- " + d[digits - 1]);
            x /= r;
        } while (x != 0);

        for (int i = 0; i < digits / 2; i++) {
            char temp = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = temp;
        }

        return digits;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int number, cardinal, dno, retry;
        char[] cno = new char[32];

        System.out.println("10진수를 기수 변환합니다.");
        do {
            do {
                System.out.print("변환할 자연수: ");
                number = stdIn.nextInt();
            } while (number < 0);

            do {
                System.out.print("변환할 기수: ");
                cardinal = stdIn.nextInt();
            } while (cardinal < 2 || cardinal > 36);

            dno = cardConv(number, cardinal, cno);

            System.out.printf("%d진수로 ", cardinal);
            for (int i = 0; i < dno; i++) System.out.print(cno[i]);
            System.out.println("입니다.");

            System.out.print("한 번 더 할까요? (1...예/0...아니요): ");
            retry = stdIn.nextInt();
        } while (retry == 1);
    }
}
