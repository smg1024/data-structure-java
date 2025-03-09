package chap02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

class ReverseArray {
    static void swap(int[] a, int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - i - 1);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Random random = Random.from(RandomGenerator.getDefault());

        System.out.print("요솟수: ");
        int num = stdIn.nextInt();

        int[] x = new int[num];

        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextInt(100);
            System.out.printf("x[%d] = %d\n", i, x[i]);
        }

        reverse(x);

        System.out.println("요소 역순 정렬.");
        System.out.printf("x = %s", Arrays.toString(x));
    }
}
