class Solution {
    public static void removeLoop(Node head) {
        if(head==null || head.next==null){
            return;
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
        if(hare==tur){
            tur=head;
            if(hare!=tur){
                while(hare.next!=tur.next){
                    hare=hare.next;
                    tur=tur.next;
                }
                hare.next=null;
            }else{
                while(hare.next!=tur){
                    hare=hare.next;
                }
                hare.next=null;
            }
        }
        
    }
}
