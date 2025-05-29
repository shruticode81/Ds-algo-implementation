package dsa.implementation.practice.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/** given 2 unsorted arrays , find intersection elements inn 2 arrays
 *  input1[] = {10, 15, 20, 25, 30,50}
 *  input2[] = {15,30,5,80}
 * Output = {15, 30}
 *
**/
public class Intersection2UnsortedArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        ArrayList<Integer> array2 = new ArrayList<>();
        for(int i=0; i<7;i++) {
            array1.add(s.nextInt());
        }
        for(int i=0; i<4;i++) {
            array2.add(s.nextInt());
        }

        HashMap<Integer, Boolean> map = new HashMap<>();
        //assume array2 is shorter in length
        for(Integer i: array2){
            map.put(i, false);
        }

        for(Integer i: array1){
            if(map.containsKey(i)) {
                map.put(i, true);
            }
        }

        for(Map.Entry<Integer, Boolean> e : map.entrySet()){
            if(e.getValue() == true){
                System.out.println(e.getKey());
            }
        }
    }
}
