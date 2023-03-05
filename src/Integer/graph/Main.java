package Integer.graph;

public class Main {
    public static void main(String[] args){
        PracticeG myG = new PracticeG();
        myG.addV("A");
        myG.addV("B");
        myG.addE("A", "B");
        myG.print();

    }
}

