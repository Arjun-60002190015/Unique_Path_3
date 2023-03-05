package Integer.Stacks;

public class Stacks {
    private Node top;
    private int height;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public Stacks(int value){
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    //Printing the Stack:

    public void printStack(){
        Node temp = top;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
    }

    //Pushing(Prepending) an item:

    public void push(int value){
        Node newNode = new Node(value);
        if(height==0){
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    public Node pop(){
        if(height==0){
            return null;
        }
        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;
        return temp;
    }

}
