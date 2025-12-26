package dsa.implementation.practice.Backtracking;

import java.util.ArrayList;
import java.util.List;


/** find permulation with creating a new string in very recursion call, instead we will just swap the character and also BT it by swappping it back **/
public class PermulationStringBT {

    public static void main(String[] args) {
        List<String> ans = new ArrayList<>();
        String str = "abc";
        char ch[] = str.toCharArray();
        permulateBT(ch, 0, ans);
        System.out.println(ans);


    }

    private static void permulateBT(char[] str, int index, List<String> ans) {
        //base cond
        if(index == str.length){
            ans.add(new String(str));
            return;
        }

        for(int i=index;i<str.length;i++){
            swapBT(str, i, index);
            permulateBT(str, index+1, ans);
            swapBT(str, i, index);
        }
    }

    private static void swapBT(char[] str, int i, int index) {
        char temp = str[index];
        str[index]=str[i];
        str[i]=temp;

    }

}
