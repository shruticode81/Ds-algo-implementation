package dsa.implementation.practice.hashing;
import java.util.*;
import java.util.stream.Collectors;

public class CountDistinctElements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = new int[7];
        for (int i=0 ;i<arr.length;i++) {
            arr[i]=s.nextInt();
        }
//        System.out.println(arr);

//        HashMap<Integer, Boolean> map = new HashMap<>();
        //hashmap is not needed for this ques
//        HashSet<Integer> set = new HashSet<>();
//        for(int i = 0;i<arr.length;i++) {
//            set.add(arr[i]);

        //improved code by passing ArrayList in the hashset constructor
        List<int[]> a = Arrays.asList(arr);
        //convert the arr[] into set uisng stream
        System.out.println(Arrays.stream(arr).boxed().collect(Collectors.toSet()).size());
        // convert int[] to Integer[]
        Integer[] arr1 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        HashSet<Integer> set = new HashSet<>(Arrays.asList(arr1));


        System.out.println("count of distict elemet using hashset: "+ set.size());
    }
}
