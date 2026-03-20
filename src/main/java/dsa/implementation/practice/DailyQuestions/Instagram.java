package dsa.implementation.practice.DailyQuestions;

import java.util.*;

public class Instagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][4];
        int n = 3;
        int m = 4;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        moderationRue(arr,n,m);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }

    private static void moderationRue(int[][] arr, int n, int m) {
        Set<Integer> listx = new HashSet<>();
        Set<Integer> listy = new HashSet<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==-999){
                   listx.add(i);
                   listy.add(j);
                }
            }
        }
        for(int x:listx){
            for(int i=0;i<m;i++){
                arr[x][i]=-999;
            }
        }
        for(int y:listy){
            for(int j=0;j<n;j++){
                arr[j][y]=-999;
            }
        }

    }
}
