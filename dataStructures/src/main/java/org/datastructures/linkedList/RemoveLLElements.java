package org.datastructures.linkedList;

public class RemoveLLElements {
    public static void main(String[] args){
        // head = [1,2,6,3,4,5,6], val = 6
        ListNode head = new ListNode(1);
        addLinkedList(head,2);
        addLinkedList(head,6);
        addLinkedList(head,3);
        addLinkedList(head,4);
        addLinkedList(head,5);
        addLinkedList(head,6);
//        printList(head);
        int val = 6;
        removeLlElements(head,val);
        printList(head);

    }
    static ListNode addLinkedList(ListNode head,int value){
        ListNode newNode = new ListNode(value);
        if(head == null) return newNode;
        ListNode current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.next = newNode;

        return head;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
    }

    public static ListNode removeLlElements(ListNode head, int val){
        if(head == null) return null;

        ListNode first = head;
        ListNode second = head;

        while(first.next!= null){
            first = first.next;
            second = first;
            if(second.value == val){
                second = null;
            }
        }
        return head;
    }
}
