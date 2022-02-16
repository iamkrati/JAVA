public class QU1 {
    public static void main(String[] args) {
     //   System.out.println("jv");
       // System.out.println(args[0]);
        int tlen= args.length;
     //   System.out.println(tlen);
        LiList obj=new LiList();
        for(int j=0;j<tlen;j++){
         //   tlen--;
            String stri=args[j];
        int len=stri.length();
            System.out.println(len);
        int mid=(len/2);
            System.out.println(mid);
        if(mid%2==0){
            mid=mid-1;
        }

        String nstr="";
        for(int i=mid-1;i>=0;i--){
            nstr=nstr + stri.charAt(i);
        }
        nstr=nstr+stri.charAt(mid);
        for(int i=len-1;i>mid;i--){
            nstr=nstr+ stri.charAt(i);
        }
        //System.out.println(nstr);
        obj.enqueue(nstr);
    }
        obj.printing();
    }
}
class LiList{
    Node front=null;
    Node rear=null;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
        }
    }
    public void enqueue(String str){
        Node node1=new Node(str);
        if(front==null && rear==null){
            front=rear=node1;
        }
        else{
            rear.next=node1;
            rear=node1;
            node1.next=null;
        }
    }
    public void printing(){
        Node cnode=front;
        while (cnode!=null){
            System.out.println(cnode.data);
            cnode=cnode.next;
        }
    }
}
