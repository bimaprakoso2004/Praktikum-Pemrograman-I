package Graph;

public class Graph {
	private Vertex[] vertexList; 
    private int[][] adjMat; 
    private int nVerts; 

    // Konstruktor untuk inisialisasi graph dengan jumlah maksimum vertex
    public Graph(int maxVerts) {
        vertexList = new Vertex[maxVerts]; 
        adjMat = new int[maxVerts][maxVerts]; 
        nVerts = 0; 

        // Set semua nilai dalam adjacency matrix ke 0
        for(int i = 0; i < maxVerts; i++) {
            for(int j = 0; j < maxVerts; j++) {
                adjMat[i][j] = 0;
            }
        }
    }

    // Method untuk menambahkan vertex baru ke dalam graph
    public void addVertex(char label) {
        vertexList[nVerts++] = new Vertex(label);
    }

    // Method untuk menambahkan edge (hubungan) antara dua vertex
    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1; 
    }
    
    // Method untuk menampilkan matriks adjacency
    public void adjacencyMatrix() {
        for (int i = 0; i < adjMat.length; i++) {
            for (int j = 0; j < adjMat[0].length; j++) {
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method untuk menampilkan vertex
    public void displayVertex(int v) {
        System.out.print(vertexList[v].getLabel());
    }
}
