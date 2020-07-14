package LinkedList;

class SinglyLinkedList
{
    Node head;
    static class Node
    {
        int data;
        Node next;

        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    public static void main(String args[])
    {
        SinglyLinkedList llist=new SinglyLinkedList();
        llist.head=new Node(2);
        Node node1=new Node(5);
        Node node2=new Node(15);
        Node node3=new Node(54);
        Node node4=new Node(135);
        Node node5=new Node(576);
        Node node6=new Node(135);
        Node node7=new Node(95);
        Node node8=new Node(115);

        llist.head.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        node6.next=node7;
        node7.next=node8;

        Node traverse=llist.head;
        while (traverse!=null)
        {
            System.out.print(""+traverse.data);
            traverse=traverse.next;
            if(traverse!=null)
            {
                System.out.print("->");
            }
        }
    }
}