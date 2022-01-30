package Collection_Framework.Linked_List;

public class Creation {
    public static void main(String[] args) {
        LL ll=new LL();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.print();
    }
}
class LL{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public void addFirst(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void addLast(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node currnode=head;
        while(currnode.next!=null){
            currnode=currnode.next;
        }
        currnode.next=newnode;
        newnode.next=null;
    }
    public void print(){
        Node currnode=head;
        while(currnode!=null){
            System.out.print(currnode.data+"->");
            currnode=currnode.next;
        }
        System.out.println("NULL");
    }
}
