/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    if(head == null){
        return false;
    }
    
    Map<Integer,Node> mappedValues = new HashMap();
    Node nextHead = head.next;
    while(head != null && nextHead.next != null){
        if(head == nextHead){
            return true;
        }
        head = head.next;
        nextHead = nextHead.next.next;
    }
    return false;
}
