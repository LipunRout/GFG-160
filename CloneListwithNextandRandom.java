
class Solution {
    public Node cloneLinkedList(Node head) {
        Node temp=head;
        while(temp!=null){
            Node Cnode=new Node(temp.data);
            Cnode.next=temp.next;
            temp.next=Cnode;
            temp=Cnode.next;
            
        }
        temp=head;
        while(temp!=null){
            if(temp.random!=null){
                temp.next.random=temp.random.next;
            }
            temp=temp.next.next;
        }
        Node clone=new Node(0),ans=clone;
        temp=head;
        while(temp!=null){
            clone.next=temp.next;
            clone=clone.next;
            temp.next=clone.next;
            temp=temp.next;
        }
        return ans.next;
        
    }
}
