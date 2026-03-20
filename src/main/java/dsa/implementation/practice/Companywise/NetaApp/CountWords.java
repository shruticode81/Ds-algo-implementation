package dsa.implementation.practice.Companywise.NetaApp;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*

Count the words
Input: Java java Java java Spring spring Hibernate
Output: Java=2, java=2, Spring=1, spring=1, Hibernate=1

*/
public class CountWords {
    public static void main(String[] args) {
        String str = "Java java Java java Spring spring Hibernate";
        String[] strArr = str.split(" ");
        HashMap<String, Integer> map = new LinkedHashMap<>();
        for(String s: strArr){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey()+"="+e.getValue());
        }
    }
}
