class PrintNumbers implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

public class NaturalNumbersRunnableDemo {
    public static void main(String[] args) {
        PrintNumbers obj = new PrintNumbers();
        Thread t = new Thread(obj);
        t.start();
    }
}