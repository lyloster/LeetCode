package solutions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Design a HashSet without using any built-in hash table libraries.
 *
 * To be specific, your design should include these functions:
 *
 * add(value): Insert a value into the HashSet.
 * contains(value) : Return whether the value exists in the HashSet or not.
 * remove(value): Remove a value in the HashSet. If the value does not exist in the HashSet, do nothing.*/
public class MyHashSet {
    private List<LinkedList<Integer>> set;

    public MyHashSet() {
        set = new ArrayList<>();
        for (int i = 0; i < 2000; ++i) {
            set.add(new LinkedList<>());
        }
    }

    public void add(int key) {
        int hash = key % set.size();
        if (!set.get(hash).contains(key)) {
            set.get(hash).add(key);
        }
    }

    public void remove(int key) {
        int hash = key % set.size();
        if (set.get(hash) != null) {
            for (int i = 0; i < set.get(hash).size(); ++i) {
                if (set.get(hash).get(i).equals(key)) {
                    set.get(hash).remove(i);
                    return;
                }
            }
        }
    }

    public boolean contains(int key) {
        int hash = key % set.size();
        if (set.get(hash) != null) {
            for (int i = 0; i < set.get(hash).size(); ++i) {
                if (set.get(hash).get(i).equals(key)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        MyHashSet hashSet = new MyHashSet();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.contains(1);    // returns true
        hashSet.contains(3);    // returns false (not found)
        hashSet.add(2);
        hashSet.contains(2);    // returns true
        hashSet.remove(2);
        hashSet.contains(2);    // returns false (already removed)
    }
}
