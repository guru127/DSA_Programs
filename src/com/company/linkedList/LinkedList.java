package com.company.linkedList;

public class LinkedList {
    Node head; // head of list
    /* Linked list Node.  This inner class is made static so that
       main() can access it */
    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    /* This function prints contents of linked list starting from head */
    public void printList()
    {
        Node n = head;
        while (n != null) {
            System.out.println(n.data + " ");
            n = n.next;
        }
    }

    /* method to create a simple linked list with 3 nodes*/
    public static void main(String[] args) {
        /* Start with the empty list. */
        LinkedList llist = new LinkedList();

        llist.find(llist, 5);
        llist.isertAtStart(0);
        llist.isertAtStart(1);
        llist.isertAtStart(2);
        llist.isertAtStart(3);
        llist.isertAtStart(4);
        // to print or traverse
        llist.printList();
        // to find length
        //   llist.length(llist);
        // to find node

        System.out.println("inserting  7 at start");
        llist.isertAtStart(7);


        llist.printList();
        System.out.println("adding at last");
        llist.addAtLAst(27);
        llist.printList();

        System.out.println("finding    7     ");
        llist.find(llist, 5);

        System.out.println("head data"+llist.head.data);
    }
    private void isertAtStart(int i) {
       Node node=new Node(i);
       node.next=head;
       head=node;
    }

    private void find(LinkedList list,int i) {
       Node temp=head;
        int length=0;
        int s =list.length(list);
        if(temp==null) {
            System.out.println("list is empty");
            return;
        }
        while(temp.next!=null){
            if (temp.data==i){
                System.out.println("number "+i+" found at "+length+" index");
                return;
            }
            length++;
           temp=temp.next;
        }
        if(length>=s-1){
            System.out.println("not found -------");
            return;
        }
    }

    private int length(LinkedList list) {
        Node head =list.head;
        int length=0;
        while(head !=null){
           length++;
           head=head.next;
        }
        //System.out.println("length is = "+ length);
        return length;
    }
    public  void addAtLAst(int i){
        Node node = new Node(i);
        if (head==null){
            head=node;
            return;
        }else if (head.next==null){
            head.next=node;
            return;
        }else {
            Node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
            return;
        }
    }
}
