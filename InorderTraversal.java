
class Solution {
    void inorder(Node root,ArrayList<Integer> in){
        if(root==null) return ;
        inorder(root.left,in);
        in.add(root.data);
        inorder(root.right,in);
    }
    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> in =new ArrayList<>();
        inorder(root,in);
        return in;
    }
}
