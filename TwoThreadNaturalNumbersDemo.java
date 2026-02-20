class ThreadOne extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 1: " + i);
        }
    }
}

class ThreadTwo extends Thread {
    public void run() {
        for (int i = 6; i <= 10; i++) {
            System.out.println("Thread 2: " + i);
        }
    }
}

public class TwoThreadNaturalNumbersDemo {
    public static void main(String[] args) {
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();

        t1.start();
        t2.start();
    }
}