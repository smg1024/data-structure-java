package chap02;

import java.util.Arrays;

class CloneArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = a.clone();

        b[3] = 0;

        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));
        System.out.println("Arrays.toString(b) = " + Arrays.toString(b));
    }
}
