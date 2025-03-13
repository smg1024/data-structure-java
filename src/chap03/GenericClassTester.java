package chap03;

class GenericClassTester {
    static class GenericClass<T> {
        private T xyz;

        GenericClass(T t) {
            this.xyz = t;
        }

        T getXyz() {
            return xyz;
        }
    }

    public static void main(String[] args) {
        GenericClass<String> string = new GenericClass<>("ABC");
        GenericClass<Integer> integer = new GenericClass<>(123);

        System.out.println(string.getXyz());
        System.out.println(integer.getXyz());
    }
}
