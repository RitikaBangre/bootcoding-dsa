package com.bootcoding.dsa.linkedlist;

import com.bootcoding.dsa.linkedlist.insertatlast.Node;

public class CreationOfList {
    public static void main(String[] args) {
        Node head = createLinkedlist();
        printLinkedList(head);
    }

    static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }


    public static void print(){
        Node head = null;
        Node temp = head;

    }

    public static Node createLinkedlist() {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=null;
        return head;
    }
    public static void printLinkedList(Node head){
        Node temp = head;
        while (temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
