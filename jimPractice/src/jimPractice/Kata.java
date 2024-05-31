package jimPractice;

import java.util.ArrayList;
import java.util.HashSet;

public class Kata {
    public static int[] arrayDiff(int[] a, int[] b) {
        // Create a HashSet from array b for fast look-up
        HashSet<Integer> setB = new HashSet<>();
        for (int value : b) {
            setB.add(value);
        }

        // Create a list to hold the result
        ArrayList<Integer> c = new ArrayList<>();
        for (int x : a) {
            // Add to the result list only if the element is not in setB
            if (!setB.contains(x)) {
                c.add(x);
            }
        }

        // Convert the result list back to an array
        int[] resultArray = new int[c.size()];
        for (int i = 0; i < c.size(); i++) {
            resultArray[i] = c.get(i);
        }

        return resultArray;
    }}
