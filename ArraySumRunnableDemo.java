class SumThread implements Runnable {
    int[] arr;
    int start, end;
    int partialSum = 0;

    SumThread(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i < end; i++) {
            partialSum += arr[i];
        }
    }
}

public class ArraySumRunnableDemo {
    public static void main(String[] args) throws Exception {

        int[] arr = {10, 20, 30, 40, 50, 60};

        SumThread obj1 = new SumThread(arr, 0, arr.length / 2);
        SumThread obj2 = new SumThread(arr, arr.length / 2, arr.length);

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        int totalSum = obj1.partialSum + obj2.partialSum;

        System.out.println("Total Sum = " + totalSum);
    }
}