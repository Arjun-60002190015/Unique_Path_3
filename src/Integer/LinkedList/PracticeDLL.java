package Integer.LinkedList;

public class PracticeDLL {
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;
        Node prev;

        Node(int value){
            this.value = value;
        }
    }

    public void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value +" ");
            temp = temp.next;
        }
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(length==0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast(){
        //Node newNode = new Node(value);
        if(length==0){
            return null;
        }
        Node temp = tail;
        tail = tail.prev;
        tail.next = null;
        temp.prev = null;
        length--;
        if(length==0){
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(length==0){
            head=  newNode;
            tail = newNode;
        }else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst(){
        if(length==0){
            return null;
        }
        Node temp = head;
        head= head.next;
        head.prev = null;
        temp.next = null;
        if(length==0){
            head = null;
            tail = null;
        }
        return temp;

    }

    public Node get(int index){
        if(index<0 || index>=length){
            return null;
        }
        Node temp = head;
        if(index<length/2){
            for(int i=0;i<index;i++){
                temp = temp.next;
            }
        }else{
            temp = tail;
            for(int i=length-1;i>index;i--){
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean set(int index, int value){
        Node temp = get(index);
        if(temp!=null){
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value){
        if(index<0 || index>length){
            return false;
        }
        if(index==0){
            prepend(value);
            return true;

        }
        if(index==length){
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
        length++;
        return true;
    }

    public Node remove(int index){
        if(index<0 || index>=length){
            return null;
        }
        if(index==0){
            return removeFirst();
        }
        if(index==length-1){
            return removeLast();
        }
        Node temp = get(index);
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.next = null;
        temp.prev = null;
        length--;
        return temp;
    }





}
