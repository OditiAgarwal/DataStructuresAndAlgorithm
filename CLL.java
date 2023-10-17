import java.lang.*;
public class CLL{
    public static void main(String[] args) {
        CLL Obj = new CLL();
        Obj.insertBegin(11);
        Obj.insertBegin(22);
        Obj.insertBegin(33);
        Obj.insertBegin(44);
        Obj.insertBegin(55);

    Obj.insertEnd(11);
        Obj.insertEnd(22);
        Obj.insertEnd(33);
        Obj.insertEnd(44);
        Obj.print();


        Obj.insertAfter(2,77);
        Obj.insertAfter(3,88);
    }
    public class Node{
        int element;
        Node next;
        public Node(int element) {
            this.element = element;
        }
    }

    public Node head = null;
    public Node tail = null;
    int size=0;
       Node newEle=new Node(element);
        if(head == null) {
            head = newEle;
            tail = newEle;
            newEle.next = head;
            newEle.prev=head;
        }
        else{
            tail.next=newEle;
            newEle.next=head;
            newEle.prev=tail;
            head.prev=newEle;
            tail=newEle;
        }
    }

    public void insertBegin(int element){
        Node newEle = new Node(element);
        if(head == null) {
            head = newEle;
            tail = newEle;
            newEle.next = head;
        }
        else {
            newEle.next=head;
            head=newEle;
            tail.next = head;
        }
        size++;
    }
    public void insertEnd(int element){
    
    public void insertAfter(int n,int data)
    {
        int size = calcSize(head);

        // Can only insert after 1st position
        // Can't insert if position to insert is greater than size of Linked List
        if(n < 1 || n > size)
        {
            System.out.println("Can't insert\n");

        }
        else
        {
            Node newNode = new Node(data);
            // required to traverse
            Node temp = head;

            // traverse to the nth node
            while(--n > 1)
                temp=temp.next;

            newNode.next= temp.next;
            temp.next = newNode;
        }
    }
    public int calcSize(Node node){
        int size = 0;
        while(node!=tail){
            node = node.next;
            size++;
        }
        return size+1;
    }

    public void print() {  //print function
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            System.out.println("Nodes of the circular linked list: ");
            do{
                System.out.print(" "+ current.element);
                current = current.next;
            }while(current != head);
            System.out.println();
        }
    }
}