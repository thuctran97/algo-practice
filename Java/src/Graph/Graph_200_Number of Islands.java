package Graph;

import java.util.ArrayDeque;

// https://leetcode.com/problems/number-of-islands/
class Solution200 {
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    bfs(i,j,grid);
                    count++;
                }
            }
        }
        return count;
    }
     static int[][] dirs={{-1,0},{1,0},{0,1},{0,-1}};
    public static void bfs(int i,int j,char[][] grid){
    ArrayDeque<int[]> q=new ArrayDeque<>();
    q.add(new int[]{i,j});
    
    while(q.size()>0){
        int[] rem=q.remove();
        for(int[] dir:dirs){
            int X=rem[0]+dir[0];
            int Y=rem[1]+dir[1];
            if(X<0 || X>=grid.length || Y<0 || Y>=grid[0].length ||                 grid[X][Y]=='0'){
                continue;
            }
            grid[X][Y]='0';
            q.add(new int[]{X,Y});
        }
    }  
}
}