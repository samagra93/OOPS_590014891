import java.util.Scanner;

class ArrayLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array:\n");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int length = 0;
        for (int i : arr) {
            length++;
        }

        System.out.println("Length of array: " + length);

        sc.close();
    }
}
