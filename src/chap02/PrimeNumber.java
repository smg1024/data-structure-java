package chap02;

class PrimeNumber {
    public static void main(String[] args) {
        // 1000 이하의 소수 나열
        int counter = 0;

        for (int n = 2; n <= 1000; n++) {
            int i;
            for (i = 2; i < n; i++) {
                counter++;
                if (n % i == 0) break;
            }
            if (n == i) System.out.println(n);
        }
        System.out.println("counter = " + counter);
    }
}
