class Thread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 1: " + i);
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        for (int i = 6; i <= 10; i++) {
            System.out.println("Thread 2: " + i);
        }
    }
}

class numberthreads {
    public static void main(String[] args) {

        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.setPriority(1);
        t2.setPriority(2);

        t1.start();   
        try{
            t1.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        t2.start();   
    }
}