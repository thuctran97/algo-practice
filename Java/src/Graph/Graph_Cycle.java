package Graph;
import java.util.ArrayList; 
import java.util.LinkedList; 
import java.util.List;
import java.util.Scanner; 
  
public class Graph_Cycle {
      
    private final int N; 
    private final List<List<Integer>> adj; 
    //Algorithm complexity: O(N + E): N: nodes, E: edges
    //with each of n nodes, I keep reaching to its linked nodes and add it to a recursion stack
    //if I found a linked nodes in recursion stack => the graph has cycle
  
    public Graph_Cycle(int N){
        this.N = N; 
        adj = new ArrayList<>(N); 
          
        for (int i = 0; i < N; i++) 
            adj.add(new LinkedList<>()); 
    } 
    private boolean isCyclicUtil(int i, boolean[] visited, 
                                      boolean[] recStack){ 
        if (recStack[i]) 
            return true; 
  
        if (visited[i]) 
            return false; 
              
        visited[i] = true; 
  
        recStack[i] = true; 
        List<Integer> children = adj.get(i); 
          
        for (Integer c: children) 
            if (isCyclicUtil(c, visited, recStack)) 
                return true; 
                  
        recStack[i] = false; 
  
        return false; 
    } 
  
    private void addEdge(int source, int dest) { 
        adj.get(source).add(dest); 
    } 
    private boolean isCyclic()  
    { 
        boolean[] visited = new boolean[N]; 
        boolean[] recStack = new boolean[N]; 
        for (int i = 0; i < N; i++) 
            if (isCyclicUtil(i, visited, recStack)) 
                return true; 
  
        return false; 
    } 
    public static void main(String[] args) 
    { 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        Graph_Cycle graph = new Graph_Cycle(n);
        for (int i=0; i<n; i++) {
        	int node1 = sc.nextInt();
        	int node2 = sc.nextInt();
        	graph.addEdge(node1, node2); 
        }
        if(graph.isCyclic()) 
            System.out.println("true"); 
        else
            System.out.println("false"); 
    } 
} 