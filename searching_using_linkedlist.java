package com.company;

public class searching_using_linkedlist {

        Node head;    //Head of list

        //Inserts a new node at the front of the list
        public void push(int new_data)
        {
            //Allocate new node and putting data
            Node new_node = new Node(new_data);

            //Make next of new node as head
            new_node.next = head;

            //Move the head to point to new Node
            head = new_node;
        }

        //Checks whether the value x is present in linked list
        public int search(Node head, int x)
        {
            Node current = head;
            int c = 0;//Initialize current
            while (current != null)
            {
                c++;
                if (current.data == x)
                    return c;    //data found
                current = current.next;

            }
            return -1;    //data not found
        }

        //Driver function to test the above functions
        public static void main(String args[])
        {

            //Start with the empty list
            searching_using_linkedlist llist = new searching_using_linkedlist();

        /*Use push() to construct below list
        14->21->11->30->10  */
            llist.push(10);
            llist.push(30);
            llist.push(11);
            llist.push(21);
            llist.push(14);
            int n = llist.search(llist.head, 21);

            if (n==-1)
                System.out.println("Not present");
            else {

                System.out.println("Yes present at "+ n); //remember search is happening from the end
            }
        }
    }

