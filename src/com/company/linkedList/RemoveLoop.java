package com.company.linkedList;

import java.util.Scanner;

public class RemoveLoop {

    static Node headNode;

    /* Structure of the node of linked list */
    static class Node {

        /* data of the node*/
        int data;

        /* This is used to point the next node of
        the currNode node */
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }


    /* This method does the following:
    1. If there is a loop in the linked list, it prints 'Yes'
     and removes the loop in the linked list and returns the head node.
    2. If there is no loop in the linked list, it prints 'No'
     and returns the head node of the linked list*/
    Node removeLoop(Node head) {

       /* Initially, set slowPtr and fastPtr to the head node of the
       linked list */
        Node slowPtr = head, fastPtr = head;

        /* Move the slowPtr by one step */
        slowPtr = slowPtr.next;

        /* Move the fastPtr by two steps */
        fastPtr = fastPtr.next.next;

       /* Move the slowPtr and fastPtr simultaneously, until they
       meet or fastPtr reaches the end of the linked list */
        while (fastPtr != null && fastPtr.next != null) {
            if (slowPtr == fastPtr) {
                break;
            }

            /* Move the slowPtr by one step */
            slowPtr = slowPtr.next;

            /* Move the fastPtr by two steps */
            fastPtr = fastPtr.next.next;
        }

        /* If loop exists, do the following  */
        if (slowPtr == fastPtr) {

            /* print 'Yes' */
            System.out.println("Yes");

            /* Move the slowPtr to the head of the linked list */
            slowPtr = head;

           /* Now, move slowPtr and fastPtr by one step simultaneously,
            until, they meet*/
            while (slowPtr.next != fastPtr.next) {
                slowPtr = slowPtr.next;
                fastPtr = fastPtr.next;
            }

           /* Now, remove the loop by making the node pointing by
           fastPtr as the last node of the linked list */
            fastPtr.next = null;
        }

        /*Otherwise, if there is no loop in the linked list, print 'No' */
        else {
            System.out.println("No");
        }

        /* If the loop exists or not, return the head node of the linked list*/
        return head;
    }

    /* This method adds a new node with data 'newData' to
    the front of the linked list*/
    public void addAtHead(int newData) {

        /* Create a new Node of data newData */
        Node newNode = new Node(newData);

        /* Now, set the next of the newNode as headNode */
        newNode.next = headNode;

        /* Next, make this newNode as head*/
        headNode = newNode;
    }


    /* This method prints every node of the linked list from the head,
    separating by a space */
    void printLinkedList(Node head) {
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.data + " ");
            tempNode = tempNode.next;
        }
    }


    // Driver program to test above functions
    public static void main(String[] args) {
        RemoveLoop list = new RemoveLoop();

        Scanner in = new Scanner(System.in);

        /* Get the number of nodes of the linked list from input */
        int n = in.nextInt();

        /* Get all nodes of the linked list from input */
        for (int i = 0; i < n; i++) {
            list.addAtHead(in.nextInt());
        }

        /* Get the value of k from input */
        int k = in.nextInt();

       /* Creating a loop, by making the next node of the last node
        as the kth node from the head of the linked list */
        if (k != 0) {
            Node first = headNode, last;
            for (int i = 0; i < k; i++) {
                first = first.next;
            }
            last = first;
            while (last.next != null) {
                last = last.next;
            }
            last.next = first;
        }

        /* Print the linked list after removing the loop */
        list.printLinkedList(list.removeLoop(headNode));
    }
}
