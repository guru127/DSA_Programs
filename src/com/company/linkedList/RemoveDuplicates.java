package com.company.linkedList;

public class RemoveDuplicates {

     Node head;

    static class Node{
        int data;
        Node next;
        public Node (int data){
            this.data=data;
            this.next=null;
        }
    }
    private static void printList(Node head) {
        Node temp= head;
        while(temp.next!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        RemoveDuplicates list =new RemoveDuplicates();

        Node node1 =new Node(1);
        list.head=node1;
        Node node2 =new Node(2);
        node1.next=node2;
        Node node3 =new Node(3);
        node2.next=node3;
        Node node4 =new Node(3);
        node3.next=node4;
        Node node5 =new Node(4);
        node4.next=node5;

       printList(list.head);

        System.out.println(" removing ");
        removeDuplicates(list.head);
        printList(list.head);
    }

    private static void removeDuplicates(Node head) {
        Node temp = head;

        while(temp!=null){
            if (temp.data==temp.next.data){
                temp=temp.next.next;
            }
            temp=temp.next;
        }
    }
}
