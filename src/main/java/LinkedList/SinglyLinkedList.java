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

    public static void getList(Node listHead) {
        Node traverse = listHead;//llist.head;
        while (traverse != null) {
            System.out.print("" + traverse.data);
            traverse = traverse.next;
            if (traverse != null) {
                System.out.print("->");
            }
        }
        System.out.println();
    }

    public static void deleteFirstNode(Node listHead)
    {
        Node temp = listHead;
        listHead = listHead.next;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        SinglyLinkedList llist = new SinglyLinkedList();
        boolean condition = true;
        Node temp;

        System.out.println("Singly Linked List");
        while (condition) {
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
                    getList(llist.head);
                    break;

                case 3:
                    //delete first/head node
                    deleteFirstNode(llist.head);
                    break;

                case 4:
                    //delete last node of linked list
                    temp = llist.head;
                    while (temp.next != null) {
                        if (temp.next.next == null) {
                            temp.next = null;
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.println("Enter the position of the node to be deleted");
                    int position = sc.nextInt();
                    temp=llist.head;
                    int i;
                    for(i=1;i<position;i++)
                    {
                        if(i==position-1)
                        {
                            temp.next=temp.next.next;
                        }
                        temp=temp.next;
                    }
                    break;

                case 10:
                    condition = false;
                    break;
            }
        }
    }
}

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