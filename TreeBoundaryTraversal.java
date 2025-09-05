class Solution {
    ArrayList<Integer> boundaryTraversal(Node node) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        if(node==null) return res;
        res.add(node.data);
        if(node.left==null && node.right==null){
            return res;
        }
        
        left(node.left,res);
        
        bottom(node,res);
        
        ArrayList<Integer> rb=new ArrayList<>();
        
        right(node.right,rb);
        
        Collections.reverse(rb);
        
        res.addAll(rb);
        return res;
        
    }
    public void left(Node root,ArrayList<Integer> res){
        while(root != null){
            if(!isLeaf(root)) res.add(root.data);
            root=(root.left !=null) ? root.left : root.right;
        }
    }
    
    public void right(Node root,ArrayList<Integer> res){
        while(root != null){
            if(!isLeaf(root)) res.add(root.data);
            root=(root.right !=null) ? root.right : root.left;
        }
    }
    public void bottom(Node root,ArrayList<Integer> res){
        if(root==null) return;
        if(isLeaf(root)) res.add(root.data);
        bottom(root.left,res);
        bottom(root.right,res);
        
    }
    private boolean isLeaf(Node node){
        return node.left==null&&node.right==null;
    }
}
