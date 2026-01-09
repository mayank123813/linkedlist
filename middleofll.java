// method 1 by finding length by simple traveral

// method 2 slow fast rule
class Solution {
    int getMiddle(Node head) {
        // code here
        Node slow = head;
        Node fast = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
}
