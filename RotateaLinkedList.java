
class Solution {
    public Node rotate(Node head, int k) {
        if(head ==null || head.next == null || k==0){
            return head;
        }
        Node curr=head;
        int len=1;
        while(curr.next!=null){
            curr=curr.next;
            len++;
        }
        curr.next=head;
        k=k%len;
        if(k==0){
            curr.next=null;
            return head;
        }
        
        curr=head;
        for(int i=1;i<k;i++){
            curr=curr.next;
        }
        Node newHead=curr.next;
        curr.next=null;
        return newHead;
        
    }
}
