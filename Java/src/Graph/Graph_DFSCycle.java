package Graph;

import java.util.*; 
class Graph_DFSCycle
{ 
	private int V;
	private boolean visited[];
	private LinkedList<Integer> adj[]; 
	private int trace[];
	Graph_DFSCycle(int v) {
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
	void traverse(int v) { 
		Iterator<Integer> iter = adj[v].iterator();
		while (iter.hasNext()) {
			int nextNode = iter.next();
			if (!visited[nextNode]) {
				visited[nextNode] = true;
				traverse(nextNode);
				visited[nextNode] = false;
			} else {
				System.out.println("nextNode: "+ nextNode);
				System.out.println("has cycle");
				return;
			}
		}
	} 

	public static void main(String args[]) {
		Graph_DFSCycle g = new Graph_DFSCycle(5);
		g.addEdge(1, 2); 
		g.addEdge(2, 3); 
		g.addEdge(3, 4); 
		g.addEdge(4, 5); 
		g.addEdge(5, 3); 
//		g.addEdge(2, 5); 
		g.traverse(1); 
	} 
} 
// This code is contributed by Aakash Hasija 
