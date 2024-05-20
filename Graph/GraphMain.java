package Graph;

public class GraphMain {
	 public static void main(String[] args) {
	        Graph graph = new Graph(5);
	        
	        // menambahkan vertex
	        graph.addVertex('A'); // 0 (start for dfs)
	        graph.addVertex('B'); // 1
	        graph.addVertex('C'); // 2
	        graph.addVertex('D'); // 3
	        graph.addVertex('E'); // 4
	        
	        // menambahkan edge
	        graph.addEdge(0, 1); // AB
	        graph.addEdge(1, 2); // BC
	        graph.addEdge(0, 3); // AD
	        graph.addEdge(3, 4); // DE
	        
	        // mencetak adjacency matrix
	        graph.adjacencyMatrix();
	        System.out.println();
	    	
//	    	Graph graph = new Graph(4);
//	        
////	        // Menambahkan vertex
////	        graph.addVertex('A'); // 0
////	        graph.addVertex('B'); // 1
////	        graph.addVertex('C'); // 2
////	        graph.addVertex('D'); // 3
////	        
////	        // Menambahkan edge sesuai gambar
////	        graph.addEdge(0, 1); // A -> B
////	        graph.addEdge(0, 2); // A -> C
////	        graph.addEdge(0, 3); // A -> D
////	        graph.addEdge(1, 3); // B -> D
////	        graph.addEdge(3, 0); // D -> A
//	        
//	        // Mencetak adjacency matrix
//	        graph.adjacencyMatrix();
//	        System.out.println();
	    	
	    	
	    }
}
