package dsa.implementation.practice.Multithreading;

import java.util.HashMap;

public class RaceCondition {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        Thread t1 = new Thread(()->{
            for (int i=0;i<1000;i++){
                map.put("key"+i,i);
            }
        });
        Thread t2 = new Thread(()->{
            for(int i=1000;i<2000;i++){
                map.put("key"+i,i);
            }
        });
        t1.start();
        t2.start();


    }
}
