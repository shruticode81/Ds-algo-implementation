package dsa.implementation.practice.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/*  input [] = [10, 12, 10,15,10,20,12,12]
*   output= 10  3
*           12  3
*           15  1
*           20  1
* */
public class Frequency {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }


//        TC: O(N) SC:O(N)
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
//            if(map.containsKey(arr[i])) {
//                Integer value = map.get(arr[i]);
//                value=value+1;
//                map.put(arr[i], value);
//             }else {
//                map.put(arr[i], 1);
//            }
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
