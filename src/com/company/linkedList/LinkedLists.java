package com.company.linkedList;

public class LinkedLists {
    static Node head;

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
        LinkedLists list =new LinkedLists();

         Node node1 =new Node(1);
         list.head=node1;
         Node node2 =new Node(2);
         node1.next=node2;
         Node node3 =new Node(3);
         node2.next=node3;
         printList(list.head);

    }
}
