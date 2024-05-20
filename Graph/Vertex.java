package Graph;

public class Vertex {
	   private char label; // Label dari vertex (misalnya 'A')
	    private boolean wasVisited; 

	    // Konstruktor untuk inisialisasi label dan set wasVisited menjadi false
	    public Vertex(char lab) {
	        this.label = lab;
	        this.wasVisited = false;
	    }

	    // Getter untuk label
	    public char getLabel() {
	        return label;
	    }

	    // Setter untuk label
	    public void setLabel(char label) {
	        this.label = label;
	    }

	    // Getter untuk wasVisited
	    public boolean wasVisited() {
	        return wasVisited;
	    }

	    // Setter untuk wasVisited
	    public void setVisited(boolean wasVisited) {
	        this.wasVisited = wasVisited;
	    }
}
