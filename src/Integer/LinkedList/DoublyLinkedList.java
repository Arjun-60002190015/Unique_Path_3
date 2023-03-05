package Integer.LinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;
    class Node{
        int value;
        Node next;
        Node prev;

        Node(int value){
            this.value = value;
        }
    }
    public DoublyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        size = 1;
    }

    //Printing a Double Linked List:

    public void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
    }

    //Appending to a Doubly Linked List:

    public void append(int value){
        Node newNode = new Node(value);
        if(size==0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    //Removing the last item:

    public Node removeLast(){
        if(size==0){
            return null;
        }
        Node temp = tail;
        tail = tail.prev;
        tail.next = null;
        temp.prev = null;
        size--;
        if(size==0){
            head = null;
            tail = null;
        }
        return temp;
    }

    //Prepending a value:

    public void prepend(int value){
        Node newNode = new Node(value);
        if(size==0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public Node removeFirst() {
        if(size==0){
            return null;
        }
        Node temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;
        size--;
        if(size==0){
            head =null;
            tail = null;
        }
        return temp;
    }

    public Node get(int index){
        if(index<0 || index>=size){
            return null;
        }
        Node temp  = head;
        if(index<size/2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        }else{
            temp = tail;
            for(int i =size-1;i>index;i--){
                temp = temp.prev;
            }
        }
        return temp;
    }

    //Setting the value to the given index:

    public boolean set(int index, int value){
        Node temp = get(index);
        if(temp!=null){
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value){
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
        Node before = get(index-1);
        Node after = before.next;
        newNode.prev = before;
        newNode.next = after;
        before.next = newNode;
        after.prev = newNode;
        size++;
        return true;
    }

    //Removing a Node:

    public Node remove(int index){
        if(index<0 || index>=size){
            return null;
        }
        if(index==0){
            return removeFirst();
        }
        if(index==size-1){
            return removeLast();
        }
        Node temp = get(index);
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.next = null;
        temp.prev = null;
        size--;
        return temp;



    }

}
