import java.util.*;
import java.util.*;

class Program {
    public static List<List<Integer>> fourNumberSum(int[] array, int targetSum) {

        List<List<Integer>> intList = new ArrayList<>();

        Map<Integer, List<Integer[]>> map = new HashMap<>();

        for (int i = 1; i < array.length - 1; i++) {

            for (int j = i + 1; j < array.length; j++) {

                int newNumber = target - (array[i] + array[j]);

                if (map.containsKey(newNumber)) {
                    for (Integer[] pair : map.get(newNumber)) {

                        List<Integer> newlist = new ArrayList<>();
                        newlist.add(pair[0]);
                        newlist.add(pair[1]);
                        newlist.add(array[i]);
                        newlist.add(array[j]);
                        intList.add(newlist);
                    }
                }
            }
            for (int k = 0; k < i; k++) {
                int ocurrence = array[k] + array[i];
                Integer[] pair = {array[k], array[i]};
                if (!map.containsKey(ocurrence)) {
                    List<Integer[]> newlist = new ArrayList<>();
                    newlist.add(pair);
                    map.put(ocurrence, newlist);
                } else {
                    map.get(ocurrence).add(pair);
                }

            }
        }
        return intList;
    }
}