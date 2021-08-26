package Graph;
//https://www.geeksforgeeks.org/count-number-ways-reach-destination-maze/
public class Graph_ReachMaze {
	public static int[][] maze = {{0,0,0,0},{0,-1,0,0},{-1,0,0,0},{0,0,0,0}};
	public static int count=0;
	public static int trace[] = new int[8];
	static void nextPoint(int x, int y, int step) {
		if (maze[x][y]==0) {
			trace[step]=x*4+y+1;
			if (x==3 && y==3) {
				count++;
				System.out.println("Result: ");
				for (int i=0; i<7; i++) {
					System.out.print(trace[i]+" ");
				}
				System.out.println();
				return;
			} 
		}
		if (x+1 != 4 && maze[x+1][y]!= -1) nextPoint(x+1, y, step+1);
		if (y+1 != 4 && maze[x][y+1]!= -1) nextPoint(x, y+1, step+1);
	}
	public static void main(String[] args) {
		nextPoint(0, 0, 0);
		System.out.println("Count: "+ count);

	}
}
