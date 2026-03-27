import java.util.*;

class Question {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.println("Enter 10 elements:");
        for (int i = 0; i < 10; i++) {
            arr.add(sc.nextInt());
        }

        // Creating map for frequency count
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Counting frequency
        for (int num : arr) {
            if (freqMap.containsKey(num)) {
                freqMap.put(num, freqMap.get(num) + 1);
            } else {
                freqMap.put(num, 1);
            }
        }

        // Printing frequency
        System.out.println("Frequency of elements:");
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        sc.close();
    }
}