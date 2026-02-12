import Package1.Car;

class Car
{
    int n;
    Car (int price)
        {
            this.n = price;
        }
        void show()
        {
            System.out.println(n);
        }
}
class BMW extends Car
{
    int m;
    BMW(int price,int updatedPrice)
    {
        super(price);
        this.n=updatedPrice;
    }
    void f1()
    {
        System.out.println(n);
    }
}
 

class Super {
    public static void main(String[] args) {
        BMW c1 = new BMW(4,10);
        c1.f1();

    }
}