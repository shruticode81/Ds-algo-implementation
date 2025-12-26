package dsa.implementation.practice.DP;
import java.util.Scanner;
import java.util.*;
public class FibonacciDP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int prev= 1;
        int prev2=0;
        for(int i=2;i<=n;i++){
            int curri = prev+prev2;
            prev2=prev;
            prev=curri;
        }
        System.out.println(prev);
//        int dp[] = new int[n+1];
//        for(int i=0;i<=n;i++){
//            dp[i]=-1;
//        }
//        System.out.println(fibM(n, dp));
    }

//    private static int fibM(int n, int[] dp) {
//        // base cond
//        if(n<=1){
//            dp[n]=n;
//            return dp[n];
//        }
//        if(dp[n]!=-1){
//            return dp[n];
//        }
//        return  dp[n]=fibM(n-1,dp)+fibM(n-2, dp);
//    }

}
