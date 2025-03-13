package chap03;

import java.util.Arrays;
import java.util.Scanner;

class IndexSearch {
    static int searchIdx(int[] a, int n, int key, int[] idx) {
        int idxIdx = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == key) idx[idxIdx++] = i;
        }

        System.out.println("Arrays.toString(idx) = " + Arrays.toString(idx));

        return idxIdx;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = stdIn.nextInt();
        int[] x = new int[num];
        int[] idx = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.printf("x[%d]: ", i);
            x[i] = stdIn.nextInt();
            System.out.println("x = " + Arrays.toString(x));
        }

        System.out.print("검색할 값: ");
        int key = stdIn.nextInt();

        int result = searchIdx(x, num, key, idx);

        System.out.println("result = " + result);
    }
}
