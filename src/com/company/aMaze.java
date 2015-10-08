package com.company;

/**
 * Created by TZ6YSQ on 10/7/2015.
 */
public abstract class aMaze implements iMaze {

    public boolean[][] maze;
    public int n, m;

    public aMaze(int x, int y) {
        maze = new boolean[x][y];
        this.n = x;
        this.m = y;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (maze[i][j]){
                    sb.append(" ");
                }else{
                    sb.append("x");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
