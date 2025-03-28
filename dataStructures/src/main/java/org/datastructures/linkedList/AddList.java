package org.datastructures.linkedList;

public class AddList {
    static class LinkedListNode {
        int data;
        LinkedListNode next;

        public LinkedListNode(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "LinkedListNode{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }
    public static void main(String[] args){

        // Write your code here.
        LinkedListNode head1 = new LinkedListNode(3);
        head1.next = new LinkedListNode(4);
        head1.next.next = new LinkedListNode(5);

        LinkedListNode head2 = new LinkedListNode(1);
        head2.next = new LinkedListNode(2);
        head2.next.next= new LinkedListNode(3);

        if(head1 == null && head2 == null) System.out.println("null");
        if(head1 == null){
            System.out.println(head2);
        }
        if(head2==null){
            System.out.println(head1);
        }
        LinkedListNode first = head1;
        LinkedListNode sum = head2;
        int firstLength = 0,secondLength = 0;
        while(first!=null){
            first = first.next;
            firstLength++;
        }

        while(sum!=null){
            sum = sum.next;
            secondLength++;
        }

        first = head1;
        sum =head2;
        if(firstLength > secondLength){
            while(first!= null){
                sum.data = sum.data + first.data;
                first = first.next;
                sum = sum.next;
            }
            System.out.println(head2);
        }else{
            while(sum!= null){
                first.data = sum.data + first.data;
                first = first.next;
                sum = sum.next;
            }
            System.out.println(head1);
        }

    }
}
