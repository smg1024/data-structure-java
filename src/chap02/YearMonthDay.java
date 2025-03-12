package chap02;

class YearMonthDay {

    static class YMD {
        int y;
        int m;
        int d;

        YMD(int y, int m, int d) {
            this.y = y;
            this.m = m;
            this.d = d;
        }

        YMD after(int n) {
            return new YMD(this.y, this.m, this.d + n);
        }

        YMD before(int n) {
            return new YMD(this.y, this.m, this.d - n);
        }

        @Override
        public String toString() {
            return "YMD{" +
                    "y=" + y +
                    ", m=" + m +
                    ", d=" + d +
                    '}';
        }
    }

    public static void main(String[] args) {

        YMD[] dates = {
                new YMD(2025, 3, 12),
                new YMD(2025, 3, 12).after(3),
                new YMD(2025, 3, 12).before(3)
        };

        for (YMD date : dates) {
            System.out.println("date.toString() = " + date.toString());
        }
    }
}
