public class Linked_list {
    Node head;

    static class Node{
        int data;
        Node next;
        Node(int d)
        {
            this.data = d;
            this.next = null;
        }
    }
    public static Linked_list insert(Linked_list list , int data)
    {
        Node new_node = new Node(data);
        new_node.next = null;
        if(list.head == null)
        {
            list.head = new_node;
        }
        //add node at last
        else{
            Node last = list.head;
            while (last.next != null)
            {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;

    }
    public static void printList(Linked_list list)
    {
        Node temp = list.head;
        System.out.println("linked list:");
        while(temp!=null)
        {
            System.out.println(temp.data + " ");
            temp = temp.next;    
        }
    }
    // deletion
    public static Linked_list deleteBykey(Linked_list list,int key)
    {
        Node currnode =list.head;
        Node prev = null;
        if(currnode != null && currnode.data==key)
        {
            list.head = currnode.next;
            return list;
        }
        while(currnode != null && currnode.data!=key)
        {
            prev = currnode;
            currnode = currnode.next;
        }
        if(currnode != null)
        {
            prev.next = currnode.next;//deletion
        }
        if(currnode == null)
        {
            System.out.println("Key not found");
        }
    }
    
}