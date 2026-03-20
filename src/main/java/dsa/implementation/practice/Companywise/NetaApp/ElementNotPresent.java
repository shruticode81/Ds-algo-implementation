package dsa.implementation.practice.Companywise.NetaApp;

import java.util.ArrayList;
import java.util.HashSet;

/*
low = 10
high = 20
ele = {19, 14, 12, 16, 15}

ans = {10, 11, 13, 17, 18, 20}
*/
//You need to return numbers between low and high that are NOT present in the array.
public class ElementNotPresent {
    public static void main(String[] args) {
      int  low = 10;
      int  high = 20;
      int[] ele = {19, 14, 12, 16, 15};

//      int[] res = new int[high-low+1];
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int num:ele){
            set.add(num);
        }

        for(int i=low;i<=high;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }

        System.out.println( list);
    }
}
