package com.company;

public class PathsInAMatrix {
    public static void main(String[] args) {
        System.out.println(pathsInAMatrix(3,7));
    }
    static int pathsInAMatrix(int n, int m){
        if (n==1 || m==1) return 1;

        int rightSidePaths = pathsInAMatrix(n,m-1);
        int downSidePaths = pathsInAMatrix(n-1,m);

        return rightSidePaths + downSidePaths ;

    }
}
