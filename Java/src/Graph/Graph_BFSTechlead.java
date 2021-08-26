package Graph;

public class Graph_BFSTechlead {
	public static boolean trace[][];
	public static int range;

	public static void main(String[] args) {
		int m = 3, n = 4;
		int[][] matrix = { { 1, 1, 2, 3 }, { 1, 2, 3, 2 }, { 3, 2, 2, 2 } };
		trace = new boolean[m][n];
		int maxRange = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (!trace[i][j]) {
					range = 0;
					BFS(i, j, matrix, m, n);
					if (range > maxRange) {
						maxRange = range;
					}
				}
			}
		}
		System.out.println(maxRange);
	}

	private static void BFS(int i, int j, int[][] matrix, int m, int n) {
		trace[i][j] = true;
		range+=1;
		int directX[] = { i - 1, i + 1, i, i };
		int directY[] = { j, j, j - 1, j + 1 };
		for (int t=0; t<4; t++) {
			if (directX[t] == -1 || directX[t] == m || directY[t] == -1 || directY[t] == n) {
				continue;
			} else 
			if (matrix[directX[t]][directY[t]]==matrix[i][j] && !trace[directX[t]][directY[t]]) {
				BFS(directX[t],directY[t],matrix,m,n);
			}
		}
	}
}
