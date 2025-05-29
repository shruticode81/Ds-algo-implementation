package dsa.implementation.practice.hashing;

import java.util.HashMap;
import java.util.HashSet;

/** input[] = [3,2,8,15,-8]
 * sum=17
 * return true if a pair exist those sum is 17 **/
public class PairSum {
    public static void main(String args[]) {
//         int arr[] = {3,1,9,15,-8};
        //        int target = 17;

        int arr1[] = {8,3,4,2,5};
        int sum=6;

        System.out.println(pairSumCal(arr, target));


    }

    private static boolean pairSumCal(int[] arr, int target) {
        HashSet<Integer> hs = new HashSet<>();
        //this code will not work if target value have exact half value in arr, bz sum=6 and 3 is present in arr 6-3 =3 check will return true
        for(int x : arr) {
            hs.add(target-x);
        }

        for(int a : arr) {
            if (hs.contains(a) == true) {
                return true;
            }
        }
        return false;
    }
}
