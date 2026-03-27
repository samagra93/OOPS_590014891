package Collections;

import java.util.*;

public class Set {
public static void main(String[] args) {
HashSet<Integer> set = new HashSet<>();

    set.add(10);
    set.add(20);
    set.add(30);

    System.out.println("After Insertion: " + set);

    set.remove(20);
    System.out.println("After Deletion: " + set);

    if (set.contains(10)) {
        set.remove(10);
        set.add(100);
    }
    System.out.println("After Update: " + set);

    System.out.println("Searching 30: " + set.contains(30));

    System.out.print("Traversal: ");
    for (int i : set) {
        System.out.print(i + " ");
    }
}


}
