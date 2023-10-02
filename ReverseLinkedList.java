package practice;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class ReverseLinkedList {
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next;

        while (current != null) {
            next = current.next; // Store the next node

            // Reverse the link
            current.next = prev;

            // Move prev and current pointers one step forward
            prev = current;
            current = next;
        }

        // Update the head of the reversed list
        head = prev;
        return head;
    }

    // Utility method to print the linked list
    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseLinkedList reverser = new ReverseLinkedList();

        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original linked list:");
        reverser.printList(head);

        // Reverse the linked list
        head = reverser.reverse(head);

        System.out.println("Reversed linked list:");
        reverser.printList(head);
    }
}

