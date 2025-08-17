import java.util.* ; 
public class TRIE{
    static class Node{
        Node child[] ; 
        boolean eow ; 
        Node(){
            child = new Node[26]  ; 
            this.eow = false ; 
        }
    }
    public static Node root = new Node() ; 
    public static void BuildTrie(String s){
        Node curr = root ;
        for(int i= 0 ;i < s.length();  i++){
            int idx = s.charAt(i) - 'a' ; 
            if(curr.child[idx] == null){
                curr.child[idx] = new Node() ; 
            }
            if(i == s.length() -1){
                curr.child[idx].eow = true; 
            }
            curr = curr.child[idx] ; 
        }
    }
    public static boolean checkString(String s){
        Node curr = root ; 
        for(int i = 0 ;i < s.length() ; i++){
            int idx = s.charAt(i) - 'a' ; 
            if(curr.child[idx] == null)return false ;
            if(i == s.length() -1 && curr.child[idx].eow == true) return true ;  
            curr = curr.child[idx] ; 
        }
        return false ; 
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter the number of dicionry name :") ; 
        int n = sc.nextInt() ; 
        for(int i = 0 ;i < n ; i++){
            BuildTrie(sc.next()) ; 
        }
        System.out.println("Enter the Dicinory Name / if we have need to stop just type STOP ") ; 
        String curr = "" ; 
        while(true){
            curr = sc.next() ; 
            if(curr.compareTo("STOP") == 0) break; 
            System.out.println(checkString(curr) == true ? "YES" : "NO") ; 
        }
        
        
    } 
}
