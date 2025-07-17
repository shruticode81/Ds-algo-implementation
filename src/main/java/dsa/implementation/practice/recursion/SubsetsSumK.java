package dsa.implementation.practice.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetsSumK {

    public static void main(String[] args) {
        int arr[] = {1,2,1};
        int k=2;
        List<Integer> subset = new ArrayList<>();
        printSubsetSumK(0, subset, 0, arr, k);
    }

    private static void printSubsetSumK(int i, List<Integer> subset, int sum, int[] arr, int k) {
        if(arr.length == i){
            if(sum == k) {
                //print the subsets
                for(int j:subset){
                    System.out.print(j +" ");
                }
                System.out.println();
            }

            return;
        }

        subset.add(arr[i]);
        sum=sum+arr[i];
        printSubsetSumK(i+1, subset, sum, arr, k);
        subset.remove(subset.size()-1);
        sum = sum-arr[i];
        printSubsetSumK(i+1, subset,sum,arr,k);
    }
}
