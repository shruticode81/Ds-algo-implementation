package dsa.implementation.practice.Backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UniquePermulationBT {
    public static void main(String[] args) {
        List<String> ans = new ArrayList<>();
        String str = "aac";
        char ch[] = str.toCharArray();
        permulateBT(ch, 0, ans);
        System.out.println(ans);


    }

    private static void permulateBT(char[] str, int index, List<String> ans) {
        //base cond
        if(index == str.length-1){
            ans.add(new String(str));
            return;
        }
        HashSet<Character> hs = new HashSet<>();
        for(int i=index;i<str.length;i++){
            if(!hs.contains(str[i])){
                hs.add(str[i]);
                swapBT(str, i, index);
                permulateBT(str, index+1, ans);
                swapBT(str, i, index); //-> backtracking
            }

        }
    }

    private static void swapBT(char[] str, int i, int index) {
        char temp = str[index];
        str[index]=str[i];
        str[i]=temp;

    }
}
