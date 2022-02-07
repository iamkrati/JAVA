package Collection_Framework.Linked_List;

public class insertion {
    public static void main(String[] args) {
        LinkList l=new LinkList();
        l.addFirst(5);
        l.addLast(6);
        l.addFirst(3);
        l.addLast(10);
        l.addLast(20);
        l.addLast(30);
        l.addLast(40);
        //l.print();
        l.insert(8,50);
        l.print();
    }
}
class LinkList{
    Node head;
    class Node{
        int id;
        Node next;
        Node(int id){
            this.id=id;
        }
    }
    public void insert(int pos,int id){
        Node newnode=new Node(id);
        //Node cnode=head;
        if(pos==1){
          newnode.next=head;
          head=newnode;
        }
        else{
            Node temp=head;
         //   Node temp1=head.next;
            for(int i=2;i<pos;i++){
                temp=temp.next;
           //     temp1=temp.next.next;
            }
            newnode.next=temp.next;
            temp.next=newnode;
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
    public void print(){
        Node cn=head;
        while(cn!=null){
            System.out.print(cn.id+"->");
            cn=cn.next;
        }
    }
}
