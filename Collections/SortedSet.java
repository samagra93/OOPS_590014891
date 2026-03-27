package Collections;

import java.util.*;

public class SortedSet {
public static void main(String[] args) {
TreeSet<Integer> set = new TreeSet<>();

    set.add(50);
    set.add(10);
    set.add(30);

    System.out.println("After Insertion: " + set);

    set.remove(10);
    System.out.println("After Deletion: " + set);

    if (set.contains(30)) {
        set.remove(30);
        set.add(300);
    }
    System.out.println("After Update: " + set);

    System.out.println("Searching 50: " + set.contains(50));

    System.out.print("Traversal: ");
    for (int i : set) {
        System.out.print(i + " ");
    }
}

}

