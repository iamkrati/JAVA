package Collection_Framework.Linked_List;

public class Deletion {
    public static void main(String[] args) {
      LinkedList o=new LinkedList();
      o.addLast(20);
      o.addFirst(10);
      o.addLast(30);
      o.deleteLast();
      o.deleteFirst();
//      o.deleteLast();
      o.print();
    }
}
class LinkedList{
    Node head;
    class Node{
        int id;
        Node next;
        Node(int id){
            this.id=id;
        }
    }
    public void addFirst(int data){
        Node nnode=new Node(data);
        if(head==null){
            head=nnode;
            return;
        }
        nnode.next=head;
        head=nnode;
    }
    public void addLast(int data){
        Node nnode=new Node(data);
        if(head==null){
            head=nnode;
            return;
        }
        Node currnode=head;
        while (currnode.next!=null){
            currnode=currnode.next;
        }
        currnode.next=nnode;
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        head=head.next;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node cnode=head.next;
        Node snode=head;
        while (cnode.next!=null){
            cnode=cnode.next;
//            cnode=cnode.next;
            snode=snode.next;
        }
        snode.next=null;
    }
    public void print(){
        Node cn=head;
        while(cn!=null){
            System.out.print(cn.id+"->");
            cn=cn.next;
        }
    }
}
