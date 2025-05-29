package dsa.implementation.practice.hashing;

import java.util.*;

public class Union2UnsortedArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        for(int i=0; i<7;i++) {
            array1.add(s.nextInt());
        }
        for(int i=0; i<4;i++) {
            array2.add(s.nextInt());
        }

        HashSet<Integer> hs = new HashSet<>();
        for(Integer x:array1) {
            hs.add(x);
        }
        for (Integer y : array2) {
            hs.add(y);
        }

        System.out.println(hs.size());
    }
}
