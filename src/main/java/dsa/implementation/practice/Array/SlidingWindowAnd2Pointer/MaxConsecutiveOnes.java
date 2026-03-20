package dsa.implementation.practice.Array.SlidingWindowAnd2Pointer;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int arr[] ={1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k=3;
        System.out.println(maxConsecutiveOnes(arr, k));
    }
    public static int maxConsecutiveOnes(int[] nums, int k) {
        //1st approach find all subarrays=> using 2 loops O(N*N)
        //2nd approach 2 pointer + sliding window

        int zeros = 0;
        int maxLength = 0;
        int left=0;
        int right=0;
        while (right<nums.length){
            if(nums[right]==0){
                zeros++;
            }
           while(zeros>k){
               if(nums[left]==0){
                   zeros--;
               }
               left++;
           }
           maxLength = Math.max(maxLength,right-left+1);
           right++;
        }
        return maxLength;
    }

    }

