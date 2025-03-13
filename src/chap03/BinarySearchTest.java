package chap03;

import java.util.Arrays;
import java.util.Scanner;

class BinarySearchTest {
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

        int idx = Arrays.binarySearch(x, key);

        if (idx < 0) System.out.println("검색할 값이 존재하지 않습니다.");
        else System.out.printf("그 값은 x[%d]에 있습니다.\n", idx);
    }
}
