//Abstraction is a feature of object oriented programming which is used to hide features inside the class these features can be classes , methods and not variable.
abstract class Sample {
    int a = 10;

    void f() {
        System.out.println(a);
    }

    abstract void f2();
}

class Sample2 extends Sample {
    void show() {
        super.f();
    }

    void f2() {
        System.out.println("done");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Sample2 s = new Sample2();
        s.show();
        s.f2();
    }
}
