package dsa.implementation.practice.Array.SlidingWindowAnd2Pointer;

public class LargestSubArrayWithKSizeConstant {
    public static void main(String[] args) {
        int arr[] = {-1,2,3,3,4,5,-1};
        int k = 4;
        System.out.println(findLargestSumSubArrayWithKsize(arr, k));
    }

    private static int findLargestSumSubArrayWithKsize(int[] arr, int k) {
        //using 2 pointer and slide the window
        int left=0;
        int right= k-1;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<k;i++){
            sum = sum+arr[i];
        }

        maxSum = sum;
        while (right<arr.length-1){
            sum = sum-arr[left];
            left++;
            right++;
            sum=sum+arr[right];
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }
}
