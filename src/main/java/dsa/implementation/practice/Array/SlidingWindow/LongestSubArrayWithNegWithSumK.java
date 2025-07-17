package dsa.implementation.practice.Array.SlidingWindow;

import java.util.HashMap;

/**input array contains both +ve and -ve**/
public class LongestSubArrayWithNegWithSumK {
    public static void main(String[] args) {
        int arr[] = {4,1,1,1,-2,3,5};
        int k=5;
        int sum=0;
        int max=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            sum = sum+arr[i];

            if (sum == k ) {
                max = Math.max(max, i+1);
            }

            if (map.containsKey(sum-k)) {
                max=Math.max(max, i-map.get(sum-k));
            }
            if(!map.containsKey(sum)) {
                map.put(sum,i);
            }
        }

        System.out.println(max);

    }
}
