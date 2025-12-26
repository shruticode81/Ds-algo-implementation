package dsa.implementation.practice.recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/** Unique permulation when String contain repeated character and you have to not get / do recursion again on the same character**/
public class UniquePermulation {
    public static void main(String[] args) {
        String str = "aab";
        List<String> ans = new ArrayList<>();
        permulate (str, " ", ans);
        System.out.println(ans);
    }

    private static void permulate(String input, String output, List<String> ans) {
        // base cond
        if(input.length() == 0){
            ans.add(output);
            return;
        }
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<input.length();i++){
            if(!hs.contains(input.charAt(i))){
                hs.add(input.charAt(i));
                String newInput = input.substring(0,i)+input.substring(i+1);
                String newOutput = output + input.charAt(i);
                permulate(newInput, newOutput, ans);
            }

        }

    }
}
