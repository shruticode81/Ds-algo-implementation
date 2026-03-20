package dsa.implementation.practice.Array.SlidingWindowAnd2Pointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// if the question is just return the maxlen then we can do it with O(N)
//but if i want to return subarray also with maxlen then O(N+N)
// 1st approach is to find all the possible subarrays and find maxlen from them
public class LongestSubArrayWithSumlessEqualK {
    public static void main(String[] args) {
        int arr[]= {2,5,1,10,10};
        int sum=14;

//        System.out.println(brutefulApproach(arr,sum));
//        System.out.println(subOptimialApproach(arr,sum));
        System.out.println(optimialApproach(arr,sum));

    }

    private static int optimialApproach(int[] arr, int sum) {
        // in this approach we don't have to use inner while if (sum>expectedSum), there is no requirement to
        //shrink the size of the array as we just have to return maxlen
        int left=0;
        int right=0;
        int maxlen=0;
        int sumR=0;
        while(right<arr.length){
            sumR=sumR+arr[right];
            if(sumR>sum){
                sumR=sumR-arr[left];
                left++;
            }
            else if(sumR<=sum){
                maxlen = Math.max(maxlen, right-left+1);
                right++;
            }
        }
        return maxlen;

    }

    private static List<Integer> subOptimialApproach(int[] arr, int sum) {
        // using 2 pointer and extend the right pointer until end and store the running maxlen
        //using inner while loop to shrink the array for (sumR>sum) cond, if we want to return subarary also
        // then we have to shrink the array
        //Tc => O(N+N)
        int left=0;
        int right = 0;
        int maxlen= 0;
        int sumR=0;
        List<Integer> subarray = new ArrayList<>();
        List<Integer> list1 = Arrays.stream(arr).boxed().collect(Collectors.toList());

        while(right<arr.length){  ///  at max it will run N => O(N)
            sumR=sumR+arr[right];
            while(sumR>sum){    ///this also at max  O(N)
                sumR=sumR-arr[left];
                left++;
            }
            if(sumR<=sum){
                if(right-left+1>maxlen){
                    maxlen=right-left+1;
                    // and subarray
                    subarray = new ArrayList<>(list1.subList(left, right+1));
                }
//                maxlen = Math.max(maxlen,right-left+1);
            }
            right++;

        }
        return subarray;
    }

    private static int brutefulApproach(int[] arr, int sum) {
        // 1st approach is to find all the possible subarrays and find maxlen from them

        int maxlen = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
            int sumR = 0;
            for(int j=i;j<arr.length;j++) {
                sumR+=arr[j];
                if(sumR<=sum) {
                    maxlen=Math.max(maxlen,j-i+1);
                }else if(sumR>sum) break;
            }
        }
        return maxlen;
    }
}
