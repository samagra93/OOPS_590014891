class SharedResource {
    synchronized void printNumbers(String threadName) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " : " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread extends Thread {
    SharedResource obj;

    MyThread(SharedResource obj, String name) {
        super(name);
        this.obj = obj;
    }

    public void run() {
        obj.printNumbers(Thread.currentThread().getName());
    }
}

public class PrioritySynchronizationDemo {
    public static void main(String[] args) {

        SharedResource obj = new SharedResource();

        MyThread t1 = new MyThread(obj, "High Priority Thread");
        MyThread t2 = new MyThread(obj, "Low Priority Thread");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
    }
}