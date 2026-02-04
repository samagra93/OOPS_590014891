class Parent {
    Parent(int x) {
        System.out.println(x);
    }

    Parent(int x, int y) {
        System.out.println(x * y);
    }
}

class Child extends Parent {

    Child() {
        super(5);        // first super() call
        super(5, 15);    // ❌ chaining super() is NOT allowed
        System.out.println("Child constructor");
    }

    public static void main(String args[]) {
        new Child();
    }
}
