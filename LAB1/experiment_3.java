package LAB1;

class experiment_3 {   
    public static void main(String[] args) {

        String[] arr = new String[args.length];

        for (int i = 0; i < args.length; i++) {
            arr[i] = args[i];
        }

        System.out.println("Array elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
