class Solution {
    int diameter=0;
    
    int diameter(Node root) {
        calculate(root);
        return diameter;
    }
    
    int calculate(Node root){
        if(root== null) return -1;
        int lh=calculate(root.left);
        int rh=calculate(root.right);
         diameter =Math.max(diameter,lh+rh+2);
         return Math.max(lh,rh)+1;
    }
}
