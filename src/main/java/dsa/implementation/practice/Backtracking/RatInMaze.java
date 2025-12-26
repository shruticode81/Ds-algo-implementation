package dsa.implementation.practice.Backtracking;

import java.util.ArrayList;

public class RatInMaze {
    static String dir = "DLRU";
    static int[] di = {1,0,0,-1};
    static int[] dj = {0, -1, 1,0};

    private static void findPath(int i, int j, int n, int[][] maze, ArrayList<String> res, String move) {
        //  base cond
        if(i==n-1 && j==n-1){
            res.add(move);
            return;
        }
        // no need for additional visited array
        maze[i][j]=0;
        for(int index=0; index<dir.length(); index++){
            int newi = i+di[index];
            int newj = j+dj[index];
            if(newi>=0 && newi<n && newj>=0 && newj<n && maze[newi][newj]==1) {
                // call recursuve
                findPath(newi, newj, n, maze, res, move + dir.charAt(index));
            }
        }
        maze[i][j]=1;

    }
    private static ArrayList<String> ratInMaze(int[][] maze) {
        ArrayList<String> res = new ArrayList<>();
        int n = maze.length;

        if(maze[0][0] == 1 && maze[n-1][n-1]==1){
            findPath(0,0,n,maze,res,"");
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] maze = {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};

        ArrayList<String> result = ratInMaze(maze);
        if(result.isEmpty()){
            System.out.println(-1);
        }else{
            for (String move: result){
                System.out.println(move);
            }
        }


    }
}
