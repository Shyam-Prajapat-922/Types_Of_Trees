import java.util.* ; 
public class BST{
    public static Node BuildBST(Node root , int val){
        if(root == null)return new Node(val) ; 
        if(root.data > val){
            root.left = BuildBST(root.left , val) ; 
        }else {
            root.right = BuildBST(root.right, val) ; 
        }
        return root; 
    }
    public static void TraverseInOrder(Node root){
        if(root == null)return ; 
        TraverseInOrder(root.left) ; 
        System.out.print(root.data + " ") ; 
        TraverseInOrder(root.right) ; 
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter the number of elements : ") ; 
        int n = sc.nextInt() ; 
        Node root = null ; 
        for(int i = 0 ;i < n ;i++){
            root = BuildBST(root,  sc.nextInt() ) ; 
        }
        TraverseInOrder(root) ; 
        
    } 
}
class Node{
    int data ; 
    Node left ; 
    Node right ; 
    Node(int data){
        this.data=  data; 
        this.left = null ;
        this.right = null ; 
    }
    Node(){}
}
