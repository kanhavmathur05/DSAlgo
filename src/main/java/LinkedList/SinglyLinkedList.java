package LinkedList;

import java.util.Scanner;

class SinglyLinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        SinglyLinkedList llist = new SinglyLinkedList();

        /*
        * TO-DO
        * 1)Insert in beginning
        * 2)Insert at end
        * 3)Insert after
        * 4)Insert before
        * 5)Delete in beginning
        * 6)Delete at end
        * 7)Delete node of data 'x'
        * 8)List all
        * 9)List in ascending order
        * 10) List in descending order
        * 11)Check availability of a node with data 'x' with location after and before node
        * 12)Create different functions for these operations.
        * */
        boolean condition = true;
        while (condition) {
            System.out.println("Singly Linked List");
            System.out.println("Select Operation:-");
            System.out.println("1) Add a node");
            System.out.println("2) View linked list");
            System.out.println("3) Delete node");
            int ch, data;
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter data in node:-");
                    data = sc.nextInt();
                    Node n = new Node(data);
                    if (llist.head != null) {
                        n.next = llist.head;
                    }
                    llist.head = n;
                    break;

                case 2:
                    Node traverse = llist.head;
                    while (traverse != null) {
                        System.out.print("" + traverse.data);
                        traverse = traverse.next;
                        if (traverse != null) {
                            System.out.print("->");
                        }
                    }
                    System.out.println();
                    break;

                case 3:
                    break;

                case 4:
                    condition = false;
                    break;
            }
        }

    }
}