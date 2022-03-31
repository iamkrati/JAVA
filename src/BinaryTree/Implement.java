package BinaryTree;

public class Implement {
    Node root;
   class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
    }
   }
   public Node search(Node root,int val){
       if(root.val==val){
           System.out.println("found");
           return root;
       }
       if(root.right==null && root.left==null){
           System.out.println("not found");
           return root;
       }
       if(val<root.val)
       search(root.left,val);
       else if(val>root.val){
           search(root.right,val);
       }
       return root;
   }
    public static void main(String[] args) {
       Implement obj=new Implement();
       obj.root=obj.insert(obj.root,14);
       obj.root= obj.insert(obj.root,18);
       obj.root=obj.insert(obj.root,12);
       obj.root=obj.insert(obj.root,15);
        obj.root=obj.insert(obj.root,19);
        obj.root=obj.insert(obj.root,10);
        obj.root=obj.insert(obj.root,13);
       obj.inorder(obj.root);
       obj.search(obj.root,14);
    }
    public Node insert(Node root,int val){
        //Node root=null;
        //root=insert();
        Node nnode=new Node(val);
        if(root==null){
            root=nnode;
            return root;
        }
        if(val<root.val){
            root.left=insert(root.left,val);
        }
        else if(val>root.val){
            root.right=insert(root.right,val);
        }
        return root;
        }
        public void inorder(Node root){
            if(root==null){
//                System.out.println(root.val);
                return;
            }
            inorder(root.left);
            System.out.println(root.val);
            inorder(root.right);
        }
    }

