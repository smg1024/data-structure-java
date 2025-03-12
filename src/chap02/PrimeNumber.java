package chap02;

class PrimeNumber {
    public static void main(String[] args) {
        int counter = 0;
        int indexPointer = 0;
        int[] prime = new int[500];

        prime[indexPointer++] = 2;

        for (int n = 3; n <= 1000; n += 2) {
            int i;
            for (i = 1; i < indexPointer; i++) {
                counter++;
                if (n % prime[i] == 0) break;
            }
            if (indexPointer == i) prime[indexPointer++] = n;
        }

        for (int i = 0; i < indexPointer; i++) {
            System.out.println(prime[i]);
        }

        System.out.println("counter = " + counter);
    }
}
