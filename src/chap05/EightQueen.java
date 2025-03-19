package chap05;

class EightQueen {
    static int[] pos = new int[8];
    static boolean[] columnFlag = new boolean[8];
    static boolean[] rightDiagonalFlag = new boolean[15];
    static boolean[] leftDiagonalFlag = new boolean[15];

    static void print() {
        for (int i = 0; i < 8; i++) {
            System.out.printf("%2d", pos[i]);
        }
        System.out.println();
    }

    static void set(int row) {
        int column;
        for (column = 0; column < 8; column++) {
            int rightDiagonal = row + column;
            int leftDiagonal = row - column + 7;

            if (!columnFlag[column] && !rightDiagonalFlag[rightDiagonal] && !leftDiagonalFlag[leftDiagonal]) {
                pos[row] = column;

                if (row == 7) print();
                else {
                    columnFlag[column] = rightDiagonalFlag[rightDiagonal] = leftDiagonalFlag[leftDiagonal] = true;
                    set(row + 1);
                    columnFlag[column] = rightDiagonalFlag[rightDiagonal] = leftDiagonalFlag[leftDiagonal] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        set(0);
    }
}
