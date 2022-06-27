package com.company;

public class ratInAMaze {

    static boolean ratinamaze(int a[][],boolean vis[][],int i,int j){
        int n= a.length;
        // Base Condition
        if (i>=n || j>= n ||   a[i][j]==0 || vis[i][j]){
            return false;
        }
        // Success Condition
        if (i==n-1 && j==n-1) return true;

        // Make This Cell As Visited
        vis[i][j]=true;

        // Checkng If A path is possible from bottom
        if(ratinamaze(a,vis,i+1,j)){
            return true;
        }
        // Checking if a path is possible from right
        if(ratinamaze(a,vis,i,j+1)) return true;

        // if no path possible from right and bottom make this as unvisited and backtrack
        vis[i][j]= false;

        return false;


    }

    public static void main(String[] args) {
        int a[][] = {
                {1, 1, 0, 1},
                {1, 1, 1, 1},
                {1, 1, 0, 1},
                {1, 0, 1, 1}
        };
        boolean vis[][]= new boolean[a.length][a.length];

        boolean isPathPossible = ratinamaze(a,vis,0,0);
        System.out.println(isPathPossible);

    }
}
