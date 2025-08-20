

class Solution {
    static Node addTwoLists(Node head1, Node head2) {
        Node fr=reverse(head1);
        Node sr=reverse(head2);
        Node head=null;
        Node prev=null;
        int carry=0;
        while(fr!=null || sr!=null || carry!=0){
            int sum = carry;
            if(fr!=null){
                sum+=fr.data;
                fr=fr.next;
            }
            if(sr!=null){
                sum+=sr.data;
                sr=sr.next;
                
            }
            carry=sum/10;
            int x=sum%10;
            Node newNode=new Node(x);
            if(head==null){
                head=newNode;
                prev=newNode;
            }
            else{
                prev.next=newNode;
                prev=prev.next;
            }
        }
        return remove(reverse(head));
        
    }
    static Node remove(Node head){
        while(head!=null && head.data==0){
            head=head.next;
        }
        return head==null?new Node(0):head;
    }
    static Node reverse(Node head){
        
        Node prev=null,curr=head;
        while(curr!=null){
            Node nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        return prev;
    }
}
