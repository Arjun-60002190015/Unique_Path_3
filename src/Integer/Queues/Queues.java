package Integer.Queues;

public class Queues {

    private int height;
    private Node first;
    private Node last;

    class Node{
        int value;
        Node next;

        Node (int value){
            this.value = value;
        }
    }

    public Queues(int value){
        Node newNode  = new Node(value);
        first = newNode;
        last = newNode;
        height = 1;

    }

    public void printQueue(){
        Node temp = first;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
    }

    public void enqueue(int value){
        Node newNode = new Node(value);
        if(height==0){
            first = newNode;
            last = newNode;
        }else{
            last.next = newNode;
            last = newNode;
        }
        height++;
    }

    public Node dequeue(){
        if(height==0){
            return null;
        }
        Node temp = first;
        first = first.next;
        temp.next = null;
        height--;
        if(height==0){
            first = null;
            last = null;
        }
        return temp;

    }



}
