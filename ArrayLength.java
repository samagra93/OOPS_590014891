class ArrayLength {
    public static void main(String[] args) {

        int[] arr = {22, 13, 14, 55, 42, 63, 62, 14, 52, 55, 33};

        int length = 0;

        for (int x : arr) {
            length++;
        }

        System.out.println("Length of array: " + length);
    }
}
