package chap02;

import java.util.Random;
import java.util.Scanner;

class MaxOfArray {
    static int maxOf(int[] a) {
        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) max = a[i];
        }
        
        return max;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Random random = new Random();

        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수: ");
        int num = stdIn.nextInt();

        int[] height = new int[num];

        for (int i = 0; i < height.length; i++) {
            height[i] = random.nextInt(150, 200);
            System.out.printf("height[%d] = %d\n", i, height[i]);
        }

        System.out.printf("키의 최댓값은 %d입니다.\n", maxOf(height));
    }
}
