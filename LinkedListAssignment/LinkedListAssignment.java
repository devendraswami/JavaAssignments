






class LinkedListAssignment
{
    public static void main(String[] args) {


                
 /*       

Q1. Given a linked list and a key ‘X‘ in, the task is to check if X is present in the linked list or not.
Examples:
14->21->11->30->10, X = 14
Yes
Explanation: 14 is present in the linked list.  



*/




     LinkedListAssignment list = new LinkedListAssignment(); 
     
      list.AddToList(14);
      list.AddToList(21);
      list.AddToList(11);
      list.AddToList(30);
      list.AddToList(10);

      list.checkIfPreset(14); 




      
/*
 
Q2. Insert a node at the given position in a linked list. We are given a pointer to a node, and the
new node is inserted after the given node.


LL = 1 -> 2 -> 4 -> 5 -> 6 pointer = 2 value = 3.

 
 */ 


LinkedListAssignment list2 = new LinkedListAssignment(); 

list2.AddToList(1);
list2.AddToList(2);
list2.AddToList(4);
list2.AddToList(5);
list2.AddToList(6);  
list2.printList();  

list2.addAfter(2, 3);
list2.printList();
 


/* 
Q3. Given the head of a sorted linked list, delete all duplicates such that each element
appears only once. Return the linked list sorted as well.

Input : head = [1,1,2]
output : head = [1,2] 


*/ 
  

LinkedListAssignment list3 = new LinkedListAssignment(); 

list3.AddToList(1);
list3.AddToList(1);
list3.AddToList(2); 

list3.printList(); 

list3.deleteDuplicates();
System.out.println("List After Deleting Duplicates "); 

list3.printList();  



/*
 Question4 Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
 
 class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true; // An empty list or single node is considered a palindrome
        }

        // Step 1: Find the middle of the linked list
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the linked list
        ListNode reversedSecondHalf = reverseLinkedList(slow);

        // Step 3: Compare the first half with the reversed second half of the linked list
        ListNode firstHalf = head;
        while (reversedSecondHalf != null) {
            if (firstHalf.val != reversedSecondHalf.val) {
                return false; // The list is not a palindrome
            }
            firstHalf = firstHalf.next;
            reversedSecondHalf = reversedSecondHalf.next;
        }

        return true; // The list is a palindrome
    }

    private ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev;
    }

    public static void main(String[] args) {
        // Create a sample linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        PalindromeLinkedList palindrome = new PalindromeLinkedList();
        boolean isPalindrome = palindrome.isPalindrome(head);

        System.out.println("Is the linked list a palindrome? " + isPalindrome);
    }
}

 

Q5. Given two numbers represented by two lists, write a function that returns the sum list. The
sum list is a list representation of the addition of two input numbers.



class LinkedList {

    static Node head1, head2;

    static class Node {

        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    void addTwoLists(Node first, Node second) {
        Node start1 = new Node(0);
        start1.next = first;
        Node start2 = new Node(0);
        start2.next = second;

        addPrecedingZeros(start1, start2);
        Node result = new Node(0);
        if (sumTwoNodes(start1.next, start2.next, result) == 1) {
            Node node = new Node(1);
            node.next = result.next;
            result.next = node;
        }
        printList(result.next);
    }

    private int sumTwoNodes(Node first, Node second, Node result) {
        if (first == null) {
            return 0;
        }
        int number = first.data + second.data + sumTwoNodes(first.next, second.next, result);
        Node node = new Node(number % 10);
        node.next = result.next;
        result.next = node;
        return number / 10;
    }
    private void addPrecedingZeros(Node start1, Node start2) {
        Node next1 = start1.next;
        Node next2 = start2.next;
        while (next1 != null && next2 != null) {
            next1 = next1.next;
            next2 = next2.next;
        }
        if (next1 == null && next2 != null) {
            while (next2 != null) {
                Node node = new Node(0);
                node.next = start1.next;
                start1.next = node;
                next2 = next2.next;
            }
        } else if (next2 == null && next1 != null) {
            while (next1 != null) {
                Node node = new Node(0);
                node.next = start2.next;
                start2.next = node;
                next1 = next1.next;
            }
        }
    }

    void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // creating first list
        list.head1 = new Node(7);
        list.head1.next = new Node(5);
        list.head1.next.next = new Node(9);
        list.head1.next.next.next = new Node(4);
        list.head1.next.next.next.next = new Node(6);
        System.out.print("First List is ");
        list.printList(head1);

        // creating second list
        list.head2 = new Node(8);
        list.head2.next = new Node(4);
        System.out.print("Second List is ");
        list.printList(head2);

        System.out.print("Resultant List is ");
        // add the two lists and see the result
        list.addTwoLists(head1, head2);
    }
}
 */



} 


 



// Node creation 
    Node head; 

    class Node 
    {
        int data;
        Node next; 

        Node(int data)
        {
            this.data = data; 
            this.next = null; 
        } 
    } 
 
    // Add Node to the list 

    public void AddToList(int data)
    {
        Node newNode = new Node(data); 
        if(head == null)
        {
           head = newNode; 
           return; 
        } 

        Node currNode = head; 
        while(currNode.next != null )
        {
            currNode = currNode.next;
        } 
        currNode.next = newNode; 
        newNode.next = null;
    } 
 
    //  Check if the Node is present in the list 

    public void checkIfPreset(int x)
    { 
        boolean flag = false; 
       Node currNode = head;  
       while(currNode != null )
       { 

         if(currNode.data == x)
         {
             flag = true; 
             
         }  

        currNode = currNode.next;
       } 
    
       if(flag == true) 
       {
        System.out.println("Element X is present in the list");
       } 
       else{
        System.out.println("Element X is not present in the list");
       }
           
    }

  

 


    // Add the Node after the given node 

    public void addAfter(int pointer, int data)
    { 
        Node newNode = new Node(data);
        Node preNode  = head;  
        Node nextNode  = head.next; 

        while(nextNode != null)
        {
            if(preNode.data == pointer)
            {
                preNode.next = newNode; 
                newNode.next = nextNode; 
                return;
            } 
            nextNode = nextNode.next; 
            preNode = preNode.next;
        }
    } 

    // Print list 

      public void printList()
      {  

        if(head == null ) 
        {
            System.out.println("List is Empty ");
        }
        Node currNode = head; 
        System.out.println("List is - ");
        while(currNode != null)
        { 
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next; 
        }

        System.out.println();

      } 



      
    // Delete Duplicate from the sorted list 

    public void deleteDuplicates()
    {
        if(head == null || head.next == null) 
        {
            return;
        } 

        Node currNode = head; 
        while(currNode != null && currNode.next != null)
        { 
            if(currNode.data == currNode.next.data)
            {
                currNode.next = currNode.next.next;  // Skip the duplicate Node 
            } 

            currNode = currNode.next; 
        }
    }

}