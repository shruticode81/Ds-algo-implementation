package dsa.implementation.practice.bitManipulation;
import java.util.List;
import java.util.ArrayList;

/* it can also be done by recursion o(2 power n * N)*/
public class PowerSubsets {
    public static List<List<Integer>> subsets(int[] arr) {
    List<List<Integer>> subsets = new ArrayList<>();
    int totalSubsets = 1 << arr.length; // x << y = x * 2^n
    for (int num = 0; num < totalSubsets; num++) {
    List<Integer> subset = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      if ((num & (1 << i)) != 0) {
         subset.add(arr[i]);
      }
    }
    subsets.add(subset);
   }
    return subsets;
   }
    public static void main(String[] args) {
        int[] arr ={1,2,2};
        List<List<Integer>> subsets = subsets(arr);
        System.out.println(subsets);
    }
}
