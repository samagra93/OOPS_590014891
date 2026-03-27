package Collections;

import java.util.*;

public class MapOperations {
public static void main(String[] args) {
HashMap<Integer, String> map = new HashMap<>();


    map.put(1, "A");
    map.put(2, "B");
    map.put(3, "C");

    System.out.println("After Insertion: " + map);

    map.remove(2);
    System.out.println("After Deletion: " + map);

    map.put(3, "Updated C");
    System.out.println("After Update: " + map);

    System.out.println("Searching key 1: " + map.containsKey(1));

    System.out.println("Traversal:");
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
        System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
}


}
