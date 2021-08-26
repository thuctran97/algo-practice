package Graph;
import java.util.*;
public class Graph_DFS
{ 
	private int V;
	private boolean visited[];
	private LinkedList<Integer> adj[]; 
	private int trace[];
	Graph_DFS(int v) {
		V = v; 
		visited = new boolean[v+1];
		trace = new int[v+1];
		adj = new LinkedList[v+1]; 
		for (int i=1; i<=v; i++) {
			adj[i] = new LinkedList<Integer>(); 
		}
			
	} 
	void addEdge(int v, int w) { 
		adj[v].add(w); 
	} 
	void traverse(int v, int step) { 
		if (v==V) {
			for (int i=0; i<step; i++) {
				System.out.print(trace[i]);
			}
			System.out.println();
			return;
		}
		Iterator<Integer> iter = adj[v].iterator();
		while (iter.hasNext()) {
			int nextNode = iter.next();
			if (!visited[nextNode]) {
				visited[nextNode] = true;
				trace[step]=nextNode;
				traverse(nextNode, step+1);
				visited[nextNode] = false;
			}
		}
	} 

	public static void main(String args[]) { 
		Graph_DFS g = new Graph_DFS(5);
		g.addEdge(1, 2); 
		g.addEdge(2, 3); 
		g.addEdge(3, 4); 
		g.addEdge(4, 5); 
		g.addEdge(3, 5); 
		g.addEdge(2, 5); 
		g.traverse(1,0); 
	} 
} 
// This code is contributed by Aakash Hasija 
