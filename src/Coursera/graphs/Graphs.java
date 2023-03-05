package Coursera.graphs;

public class Graphs {
    private int numVertices;
    private int numEdges;

    public Graphs() {
        numVertices = 0;
        numEdges =0;

    }
    public int getNumVertices(){
        return numVertices;
    }
    public int getNumEdges(){
        return numEdges;
    }

    public void addVertex(){
        implementAddVertex();
        numVertices++;
    }

    public void implementAddVertex() {
    }

    public class GraphAdjM extends Graphs{
        private int[][] adjM;

        public void implementAddEdge(int v, int w){
            adjM[v][w] = 1;
        }
    }
}
