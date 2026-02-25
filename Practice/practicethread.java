package Practice;

class MyThread1 extends Thread 
{
    public void run()
    {
        System.out.println("Thread 1 is running:");
    }
}
class MyThread2 extends Thread 
{
    public void run()
    {
        System.out.println("Thread 2 is running:");
    }
}

class practicethread{
    public static void main(String args[])
    {
        MyThread1 obj1 = new MyThread1();
        MyThread2 obj2 = new MyThread2();
        obj1.start();
        obj2.start();
    }
}