package chap01;

import java.util.Scanner;

public class TwoDigits {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int no;

        System.out.println("2자리 양수를 입력하세요.");

        do {
            System.out.print("no값: ");
            no = stdIn.nextInt();
        } while (no > 99 || no < 10);

        System.out.printf("no = %d\n", no);
    }
}
