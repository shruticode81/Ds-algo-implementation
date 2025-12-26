package dsa.implementation.practice.recursion;

import java.util.ArrayList;
import java.util.List;

/* find permulation of string using input and output method in aditya verma playlist**/
public class PermulationString {
    public static void main(String[] args) {
        String str = "abc";
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
        for(int i=0;i<input.length();i++){
            String newInput = input.substring(0,i)+input.substring(i+1);
            String newOutput = output + input.charAt(i);
            permulate(newInput, newOutput, ans);
        }

    }
}
