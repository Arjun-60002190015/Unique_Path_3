package Integer.LinkedList;

public class PracticeLinkedList {

    private Node head;
    private Node tail;
    private int size;
    class Node{
        Node next;
        int value;

        Node (int value){
            this.value = value;
        }
    }

    public PracticeLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        size = 1;
    }

    //Printing a Linked List:
    public void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
    }

    //Appending in a Linked List:

    public void append(int value){
        Node newNode = new Node(value);
        if(size==0){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;

        }
        size++;
    }

    //Prepending a value to the List:

    public void prepend(int value){
        Node newNode = new Node(value);
        if(size==0) {
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    //Removing Last item from the List:

    public Node removeLast(){
        if(size==0){
            return null;
        }
        Node temp = head;
        Node pre = head;
        while(temp.next!=null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        size--;
        if(size==0){
            head = null;
            tail = null;
        }
        return temp;
    }

    //Removing the first value from the List:

    public Node removeFirst(){
        if(size==0){
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        size--;
        if(size==0){
            tail = null;
        }
        return temp;
    }

    //Getting the Value from Index:

    public Node get(int index){
        if(index<0 || index>=size){
            return null;
        }
        Node temp =head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        return temp;
    }

    public boolean insert(int value, int index){
        if(index<0 || index>size){
            return false;
        }
        if(index==0){
            prepend(value);
            return true;
        }
        if(index==size){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index-1);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
        return true;
    }

    //Setting a value to the given Index:

    public boolean set(int value, int index){
        Node temp = get(index);
        if(temp!=null){
            temp.value = value;
            return true;
        }
        return false;
    }

    //Removing the value from the given index:

    public Node remove(int index){
        if(index<0 || index<=size){
            return null;
        }
        if(index==0){
            return removeFirst();
        }
        if(index==size-1){
            return removeLast();
        }
        Node prev = get(index-1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        size--;
        return temp;
    }

    //Reversing the Linked List:

    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for(int i=0;i<size;i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }





}
