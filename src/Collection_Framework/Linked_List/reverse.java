package Collection_Framework.Linked_List;
public class reverse {
    public static void main(String[] args) {
        LINK_LIST ll=new LINK_LIST();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printLL();
        ll.reverse();
    }
}
class LINK_LIST {
    Node head;
    class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }
    public void addFirst(int value) {
        Node newnode = new Node(value);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    public void printLL() {
        Node currnode = head;
        while (currnode != null) {
            System.out.print(currnode.value + "->");
            currnode = currnode.next;
        }
        System.out.println("NULL");
    }
    public void reverse() {
        Node pnode = head;
        Node cnode = head.next;
        while (cnode != null){
            Node nnode=cnode.next;
            cnode.next=pnode;
            pnode=cnode;
            cnode=nnode;
        }
        head.next=null;
        head=pnode;
        printLL();
    }
}
