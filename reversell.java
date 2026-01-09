// method 1 using stack but has space complexity
// method 2 recursive

class Solution {
    Node reverseList(Node head) {
        // code here
        if(head==null || head.next==null){
            return head;
        }
        Node nex = reverseList(head.next);
        Node front=head.next;
        front.next=head;
        head.next=null;
        
        return nex;
    }
}

// method 3
class Solution {
    // Function to reverse a linked list iteratively
    public ListNode reverseList(ListNode head) {
        // Initialize previous pointer to null
        ListNode prev = null;

        // Start from the head of the list
        ListNode temp = head;

        // Traverse the list
        while (temp != null) {
            // Save the next node
            ListNode front = temp.next;

            // Reverse the current node's pointer
            temp.next = prev;

            // Move prev to current node
            prev = temp;

            // Move to the next node
            temp = front;
        }

        // Return new head (last node becomes first)
        return prev;
    }
}
