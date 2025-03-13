package chap03;

import java.util.Arrays;
import java.util.Scanner;

class SequentialSearch {
    static int seqSearch(int[] a, int n, int key) {
        for (int i = 0; i < n; i++) {
            if (a[i] == key) return i;
        }
        return -1;

//        int i = 0;
//
//        while (true) {
//            if (i == n) return -1;
//            if (a[i] == key) return i;
//            i++;
//        }
    }

    static int seqSearchSentinel(int[] a, int n, int key) {
        a[n] = key;

        int i = 0;
        while (true) {
            if (a[i] == key) break;
            i++;
        }

        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = stdIn.nextInt();
        int[] x = new int[num + 1];

        for (int i = 0; i < num; i++) {
            System.out.printf("x[%d]: ", i);
            x[i] = stdIn.nextInt();
            System.out.println("x = " + Arrays.toString(x));
        }

        System.out.print("검색할 값: ");
        int key = stdIn.nextInt();

        int idx = seqSearchSentinel(x, num, key);

        if (idx == -1) System.out.println("검색할 값이 존재하지 않습니다.");
        else System.out.printf("그 값은 x[%d]에 있습니다.\n", idx);
    }
}
