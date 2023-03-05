package Integer.graph;

import java.util.ArrayList;
import java.util.HashMap;

public class PracticeG {
    public HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    public void print(){
        System.out.println(adjList);
    }

    public boolean addV(String vertex){
        if(adjList.get(vertex)==null){
            adjList.put(vertex, new ArrayList<String>());
            return true;
        }
        return false;
    }

    public boolean addE(String vertex1, String vertex2){
        if(adjList.get(vertex1)!=null && adjList.get(vertex2)!=null){
            adjList.get(vertex1).add(vertex2);
            adjList.get(vertex2).add(vertex1);
            return true;
        }
        return false;

    }

    public boolean removeV(String veretx){
        if(adjList.get(veretx)==null)
            return false;

        for(String other:adjList.get(veretx)) {
            adjList.get(other).remove(veretx);

        }
        adjList.remove(veretx);
        return true;
    }

    public boolean removeE(String vertex1, String vertex2){
        if(adjList.get(vertex1)!=null && adjList.get(vertex2)!=null){
            adjList.get(vertex1).remove(vertex2);
            adjList.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }


}
