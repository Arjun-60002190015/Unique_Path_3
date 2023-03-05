package Integer.Trees;

public class Main {
    public static void main(String[] args){
        PracticeBST ob = new PracticeBST();
        ob.insert(47);
        ob.insert(21);
        ob.insert(76);
        ob.insert(18);
        ob.insert(27);
        ob.insert(52);
        ob.insert(82);
        System.out.println(ob.BFS());
        System.out.println(ob.DFSPreOrder());
        System.out.println(ob.DFSPostOrder());
        System.out.println(ob.DFSInOrder());

    }
}
