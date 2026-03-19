// class A {

//     int sum(int a, int b) {
//         return a + b;
//     }

//     float sum(float a, float b) {
//         return a + b;
//     }
// }

// class Generic {
//     public static void main(String[] args) {

//         A a = new A();

//         System.out.println(a.sum(2, 3));
//         System.out.println(a.sum(2.0f, 3.0f));
//     }
// }


class A {

    <T extends Number> double sum(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
}

class Generic {
    public static void main(String[] args) {

        A a = new A();

        System.out.println(a.sum(2, 3));
        System.out.println(a.sum(2.0, 3.0));
    }
}