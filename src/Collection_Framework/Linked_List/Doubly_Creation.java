package Collection_Framework.Linked_List;

public class Doubly_Creation {
    public static void main(String[] args) {
        Doubly_LL obj=new Doubly_LL();
        obj.addFirst(5);
        obj.addFirst(4);
        obj.addFirst(3);
        obj.addLast(6);
        obj.insert(1,50);
        obj.print();
    }
}
class Doubly_LL{
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
    public void insert(int pos,int data){
        Node nnode=new Node(data);
        if(pos==1){
            nnode.prev=null;
            nnode.next=head;
            head=nnode;
        }
        else{
            Node cnode=head;
            for(int i=2;i<pos;i++){
                cnode=cnode.next;
            }
            //https://gist.github.com/iamkrati/0d6da51d9deaf7bbf55940795ecda706
            nnode.next=cnode.next;
            cnode.next=nnode;
            nnode.prev=cnode;
        }
    }
    public void print(){
        Node cnode=head;
        while(cnode!=null){
            System.out.println(cnode.data);
            cnode=cnode.next;
        }
    }
}
