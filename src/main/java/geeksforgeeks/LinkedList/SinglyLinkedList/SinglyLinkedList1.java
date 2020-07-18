package geeksforgeeks.LinkedList.SinglyLinkedList;

import java.util.Scanner;

class SinglyLinkedList1 {
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

    public static Node deleteFirstNode(Node listHead) {
        Node temp = listHead;
        listHead = listHead.next;
        return listHead;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        SinglyLinkedList1 llist = new SinglyLinkedList1();
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
                    llist.head = deleteFirstNode(llist.head);
                    break;

                case 4:
                    //delete last node of linked list
                    temp = llist.head;
                    while (temp.next != null) {
                        if (temp.next.next == null) {
                            temp.next = null;
                            break;
                        }
                        temp = temp.next;
                    }
                    break;

                case 5: //Case to get the first node. Still Incomplete.
                    System.out.println("Enter the position of the node to be deleted");
                    int position = sc.nextInt();
                    temp = llist.head;
                    int i;
                    for (i = 1; i <= position; i++) {
                        if (i == position - 1) {
                            temp.next = temp.next.next;
                        }
                        temp = temp.next;
                    }
                    break;


                case 6:
                    //Delete linked list
                    llist.head=null;
                    break;

                case 7: //Length of the linked list
                    System.out.println("List Length:-"+getListLength(llist.head));
                case 10:
                    condition = false;
                    break;
            }
        }

    }

/*  Recursive way to get Linked List Length
    public static int getCountRec(Node node)
    {
        // Base case
        if (node == null)
            return 0;

        // Count is this node plus rest of the list
        return 1 + getCountRec(node.next);
    }

    *//* Wrapper over getCountRec() *//*
    public int getCount()
    {
        return getCountRec(head);
    }*/

    public static int getListLength(Node listHead)
    {
        Node temp=listHead;
        int count=0;
        while (temp!=null)
        {
            count++;
            temp=temp.next;
        }
        return count;
//        int count=1;
//        if(listHead==null)
//        {
//            return count-1;
//        }
//        else {
//            if(listHead!=null && listHead.next==null)
//            {
//                return count;
//            }
//            else
//            {
//                while (listHead.next!=null)
//                {
//                    listHead.next=listHead.next.next;
//                    count++;
//                }
//                return count;
//            }
//
//        }
    }
}