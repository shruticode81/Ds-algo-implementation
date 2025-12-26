//package dsa.implementation.practice.DP;
//import java.util.*;
///**
// * Given an integer array height[] where height[i] represents the height of the i-th stair, a frog starts from the first stair and wants to reach the top. From any stair i, the frog has two options: it can either jump to the (i+1)th stair or the (i+2)th stair. The cost of a jump is the absolute difference in height between the two stairs. Determine the minimum total cost required for the frog to reach the top.
// * Now instead of just i+1 and i+2 frog can do k jumps (i+1),i+2,i+3,i+4, .......i+k jumps
// * **/
//public class FrogKJump {
//    public static void main(String[] args) {
//        int n = 6;
//        int arr[] = new int[n];
//        Scanner s = new Scanner(System.in);
//        for(int i=0;i<n;i++){
//            arr[i]=s.nextInt();
//        }
//        int k = s.nextInt();
//        System.out.println(minCostKJump(arr, n-1,k));
//    }
//
//    private static int minCostKJump(int[] arr, int index, int k) {
//        // base cond
//        if(index == 0) return 0;
//        int minCost = Integer.MAX_VALUE;
//        for(int i=1;i<=k;i++){
//            if(index-k>=0){
//                int jump = minCostKJump(arr,index-j,k)+ Math.abs(arr[index]-arr[index-j]);
//                minCost=Math.min(minCost, jump);
//            }
//        }
//        return minCost;
//    }
//
//}
