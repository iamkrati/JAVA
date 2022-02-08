package Collection_Framework.Linked_List;

public class Doubly_Deletion {
    public static void main(String[] args) {
        Doubly_LL1 l1=new Doubly_LL1();
        l1.addFirst(4);
        l1.addFirst(3);
        l1.addLast(5);
        l1.addFirst(2);
        l1.addFirst(1);
        l1.addLast(6);
        l1.addFirst(4);
        l1.addFirst(3);
        l1.addLast(5);
        l1.addFirst(2);
        l1.addFirst(1);
        l1.addLast(6);
        l1.print();
        System.out.println();
        l1.delete(8);
        l1.print();
    }
}
class Doubly_LL1{
    Node head;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
        }
    }
    public void addFirst(int data){
        Node newnode=new Node(data);
        Node cnode=head;
        newnode.next=head;
        newnode.prev=null;
        if(head==null){
            head=newnode;
            return;
        }
        head.prev=newnode;
        head=newnode;
    }
    public void addLast(int data){
        Node newnode=new Node(data);
        Node cnode=head;
        newnode.next=null;
        if(head==null){
            newnode.prev=null;
            head=newnode;
            return;
        }
        while(cnode.next!=null){
            cnode=cnode.next;
        }
        cnode.next=newnode;
        newnode.prev=cnode;
    }
    public void delete(int pos){

        if(pos==1){
       //     head.next.prev=null;
            head=head.next;
            return;
        }
        else {
          //  Node cn=head.next;
            Node sn=head;
            for(int i=2;i<pos && sn.next!=null;i++){
                //cn=cn.next;
                sn=sn.next;
            }
            sn.next=sn.next.next;
            sn.next.prev=sn;
        }

    }
    public void print(){
        Node cnode=head;
        while(cnode!=null){
            System.out.print(cnode.data+"->");
            cnode=cnode.next;
        }
    }
}

