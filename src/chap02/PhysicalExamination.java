package chap02;

class PhysicalExamination {

    static final int VMAX = 21;

    static class PhysicalData {
        String name;
        int height;
        double vision;

        PhysicalData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    static double averageHeight(PhysicalData[] dataArray) {
        double sum = 0;

        for (PhysicalData data : dataArray) {
            sum += data.height;
        }

        return sum / dataArray.length;
    }

    static void distributeVision(PhysicalData[] dataArray, int[] dist) {
        int i = 0;
        dist[i] = 0;

        for (PhysicalData data : dataArray) {
            if (data.vision >= 0.0 && data.vision <= VMAX / 10.0) {
                dist[(int) (data.vision * 10)]++;
            }
        }
    }

    public static void main(String[] args) {
        PhysicalData[] studentList = {
                new PhysicalData("강민하", 162, 0.3),
                new PhysicalData("김찬우", 173, 0.7),
                new PhysicalData("박준서", 175, 2.0),
                new PhysicalData("유서범", 171, 1.5),
                new PhysicalData("이수연", 168, 0.4),
                new PhysicalData("장경오", 174, 1.2),
                new PhysicalData("황지안", 169, 0.8)
        };
        int[] visionDistribution = new int[VMAX];

        System.out.println("--신체검사 리스트--");
        System.out.println("이름     키     시력");
        System.out.println("-------------------");

        for (PhysicalData data : studentList) {
            System.out.printf("%-8s%3d%5.1f\n",
                    data.name, data.height, data.vision);
        }

        System.out.printf("\n평균 키: %5.1fcm\n", averageHeight(studentList));

        distributeVision(studentList, visionDistribution);

        System.out.println("\n시력 분포");
        for (int i = 0; i < VMAX; i++) {
            System.out.printf("%3.1f~: %2d명\n", i / 10.0, visionDistribution[i]);
        }
    }
}
