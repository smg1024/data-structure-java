package chap03;

import java.util.Arrays;
import java.util.Scanner;

class BinarySearch {
    static int binarySearch(int[] a, int n, int key) {
        int left = 0;
        int right = n - 1;

        do {
            int center = (left + right) / 2;
            if (a[center] == key) return center;
            else if (a[center] < key) left = center + 1;
            else right = center - 1;

        } while (left <= right);
        return -1;
    }

    static int binarySearchX(int[] a, int n, int key) {
        int left = 0;
        int right = n - 1;

        do {
            int center = (left + right) / 2;
            if (a[center] == key) {
                while (a[center - 1] == key) center -= 1;
                return center;
            } else if (a[center] < key) left = center + 1;
            else right = center - 1;

        } while (left <= right);
        return -1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.printf("x[%d]: ", i);
            x[i] = stdIn.nextInt();
            System.out.println("x = " + Arrays.toString(x));
        }

        x = Arrays.stream(x).sorted().toArray();
        System.out.println("Sorted x = " + Arrays.toString(x));

        System.out.print("검색할 값: ");
        int key = stdIn.nextInt();

        int idx = binarySearchX(x, num, key);

        if (idx == -1) System.out.println("검색할 값이 존재하지 않습니다.");
        else System.out.printf("그 값은 x[%d]에 있습니다.\n", idx);
    }
}
