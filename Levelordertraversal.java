
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer> level=new ArrayList<>();
            
            for(int i=0;i<size;i++){
                Node curr=q.poll();
                level.add(curr.data);
                
                if(curr.left != null) q.add(curr.left);
                if(curr.right !=null) q.add(curr.right);
                
                
            }
            ans.add(level);
            
        }
        return ans;
    }
}
