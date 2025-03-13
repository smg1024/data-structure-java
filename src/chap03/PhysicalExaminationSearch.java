package chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class PhysicalExaminationSearch {
    static final int VMAX = 21;

    static class PhysicalData {
        private String name;
        private int height;
        private double vision;

        PhysicalData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        @Override
        public String toString() {
            return "PhysicalData{" +
                    "name='" + name + '\'' +
                    ", height=" + height +
                    ", vision=" + vision +
                    '}';
        }

        private static final Comparator<PhysicalData> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhysicalData> {
            @Override
            public int compare(PhysicalData o1, PhysicalData o2) {
                return Integer.compare(o1.height, o2.height);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PhysicalData[] studentList = {
                new PhysicalData("강민하", 162, 0.3),
                new PhysicalData("김찬우", 173, 0.7),
                new PhysicalData("박준서", 175, 2.0),
                new PhysicalData("유서범", 171, 1.5),
                new PhysicalData("이수연", 168, 0.4),
                new PhysicalData("장경오", 174, 1.2),
                new PhysicalData("황지안", 169, 0.8)
        };

//        studentList = (PhysicalData[]) Arrays.stream(studentList).sorted(PhysicalData.HEIGHT_ORDER).toArray();
        System.out.println("studentList = " + Arrays.toString(studentList));

        System.out.print("키가 몇 cm인 학생을 찾고 있나요? ");
        int height = scanner.nextInt();

        int idx = Arrays.binarySearch(studentList, new PhysicalData("", height, 0.0), PhysicalData.HEIGHT_ORDER);

        if (idx < 0) System.out.println("그런 학생은 없습니다.");
        else {
            System.out.printf("해당 학생은 studentList[%d]에 있습니다.\n", idx);
            System.out.println("studentList[idx] = " + studentList[idx]);
        }
    }
}
