package chap05;

import java.util.Scanner;

class Hanoi {
    static void move(int no, int from, int to) {
        int middle = 6 - from - to;

        if (no > 1) move(no - 1, from, middle);

        System.out.printf("원반[%d]을(를) %d번 기둥에서 %d번 기둥으로 옮김\n", no, from, to);

        if (no > 1) move(no - 1, middle, to);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of plates: ");
        int no = scanner.nextInt();

        move(no, 1, 3);
    }
}
