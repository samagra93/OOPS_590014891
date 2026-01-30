class Car {
    int price;

    Car(int x) {
        price = x;
    }

    void showPrice() {
        System.out.println("Car price: " + price);
    }
}

class BMW extends Car {
    BMW() {
        super(1000000);
    }

    void brand() {
        System.out.println("Brand: BMW");
    }
}

class BMWSeries7 extends BMW {
    BMWSeries7() {
        super();
    }

    void model() {
        System.out.println("Model: BMW Series 7");
    }
}

public class inheritance {
    public static void main(String[] args) {
        BMWSeries7 obj = new BMWSeries7();
        obj.showPrice();
        obj.brand();
        obj.model();
    }
}
