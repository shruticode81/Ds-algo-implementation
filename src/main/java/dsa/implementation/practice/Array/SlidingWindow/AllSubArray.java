package dsa.implementation.practice.Array.SlidingWindow;

import java.util.ArrayList;
import java.util.List;

//import static jdk.internal.org.jline.reader.impl.LineReaderImpl.CompletionType.List;

public class AllSubArray {

    public static void main(String[] args) {
        int arr[] = {2,3,4,5};
        List<List<Integer>> res = generateAllSubArray(arr);
        for (List i: res){
            System.out.println(i);
        }
    }

    private static List<List<Integer>> generateAllSubArray(int[] arr) {
        int n = arr.length;
        List<List<Integer>> res = new ArrayList<>();
        for(int start=0;start<n;start++){
            ArrayList<Integer> sub = new ArrayList<>();
            for (int end=start;end<n;end++){
                sub.add(arr[end]);
                res.add(new ArrayList<>(sub));
            }
        }
        return res;
    }
}
