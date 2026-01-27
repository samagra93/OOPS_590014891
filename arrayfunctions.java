import java.util.Arrays;

public class arrayfunctions {
    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 7};
        int[] copyArr = new int[5];

        int length = arr.length;

        Arrays.sort(arr);

        int index = Arrays.binarySearch(arr, 7);

        System.arraycopy(arr, 0, copyArr, 0, arr.length);

        boolean isEqual = Arrays.equals(arr, copyArr);

        Arrays.fill(copyArr, 3);

        String arrayString = Arrays.toString(arr);

        int[] newArr = Arrays.copyOf(arr, 7);

        int[] rangeArr = Arrays.copyOfRange(arr, 1, 4);

        int hash = Arrays.hashCode(arr);

        System.out.println(length);
        System.out.println(index);
        System.out.println(isEqual);
        System.out.println(arrayString);
        System.out.println(Arrays.toString(newArr));
        System.out.println(Arrays.toString(rangeArr));
        System.out.println(hash);
    }
}
