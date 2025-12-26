package dsa.implementation.practice.hashing;

import java.net.Inet4Address;
import java.util.*;

public class SortHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Banana",1);
        map.put("Apple",4);
        map.put("orange",3);

        //sort the list of key/value pairs (map)
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByKey());
        /**🧩 1. Map.Entry.comparingByKey():
         * Compares entries by their keys.
         Sorts based on the key's natural ordering (e.g., alphabetical for strings, numeric for integers).
         * Equivalent to:

         * Comparator<Map.Entry<K, V>> comparator =
         *     (e1, e2) -> e1.getKey().compareTo(e2.getKey());
         **/

        /**here Map.Entry.comparingByValue() is equivalent to:
         Comparator<Map.Entry<K, V>> comparator = (e1, e2) -> e1.getValue().compareTo(e2.getValue());
         Map.Entry.comparingByValue() is a static utility method introduced in Java 8 in the Map.Entry interface.
         It returns a Comparator that compares Map.Entry<K, V> objects based on their values.
         static <K, V extends Comparable<? super V>> Comparator<Map.Entry<K, V>> comparingByValue()
         **/

        list.sort(Map.Entry.<String, Integer>comparingByValue().reversed());
        /**Please refer : https://chatgpt.com/share/68909b40-5d3c-800c-9342-20cdaee8fe85**/
//                 Comparator<Map.Entry<K, V>> comparator =


    }
}
