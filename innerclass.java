class A
{
    int age;
    public void show()
    {
        System.out.println("Show in A class");
    }

    class B
    {
        public void out()
        {
            System.out.println("Out in B class");
        }
    }
}

public class innerclass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        obj1.out();
    }
}
