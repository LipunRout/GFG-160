

class Solution {
    public static Node findFirstNode(Node head) {
        // code here
        if(head==null || head.next==null){
            return head;
        }
        Node hare=head;
        Node tur=head;
        while(hare!=null && hare.next!=null){
            hare=hare.next.next;
            tur=tur.next;
            if(hare==tur){
                 break;
                
            }
        }
        if(hare!=tur){
            return null;
            
        }
        tur=head;
        while(tur!=hare){
            hare=hare.next;
            tur=tur.next;
        }
        return tur;
    }
}
