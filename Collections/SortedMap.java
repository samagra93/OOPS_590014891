package Collections;

import java.util.*;

public class SortedMap {
public static void main(String[] args) {
TreeMap<Integer, String> map = new TreeMap<>();

    map.put(5, "E");
    map.put(1, "A");
    map.put(3, "C");

    System.out.println("After Insertion: " + map);

    map.remove(1);
    System.out.println("After Deletion: " + map);

    map.put(3, "Updated C");
    System.out.println("After Update: " + map);

    System.out.println("Searching key 5: " + map.containsKey(5));

    System.out.println("Traversal:");
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
        System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
}

}

