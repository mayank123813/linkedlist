// in this we need to reverse both the ll \
// and check codition like if particular ll is null or nut if not then well move it next as well as add in it
// default value will be zero

linked list solution

/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node addTwoLists(Node head1, Node head2) {
        // code here
        Node head = new Node(-1);
        Node t = head;
        
        head1=reverse(head1);
        head2=reverse(head2);
        
        
        Node t1=head1;
        Node t2=head2;
        
        int car=0;
        while(t1!=null || t2!=null){
            int temp=car;
            if(t1!=null){
                temp+=t1.data;
            }
            if(t2!=null){
                temp+=t2.data;
            }
            Node nex = new Node(-1);
            nex.data = temp%10;
            car=temp/10;
            t.next=nex;
            t=t.next;
            if(t1!=null){
            t1=t1.next;
            }
            if(t2!=null){
            t2=t2.next;
            }
        }
        if(car==1){
            Node nex=new Node(1);
            t.next=nex;
            t=t.next;
        }
        
        head=head.next;
        head=reverse(head);
        t=head;
         
        while(t.data==0 ){
            t=t.next;
        }   
    
        return t;
        
        
        
    }
    public Node reverse(Node head){
        
        if(head==null || head.next==null) return head;
        
        Node prev=null;
        Node cur=head;
        Node nex=head;
        
        while(cur!=null){
            nex=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nex;
        }
        return prev;
        
        
    }
}
