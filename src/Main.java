public class Main {
    public static void main(String[] args) {
        ReverseLinkedList solution = new ReverseLinkedList();

        // Example 1
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        ListNode reversed1 = solution.reverseList(head1);
        printList(reversed1); // Output: 5 -> 4 -> 3 -> 2 -> 1

        // Example 2
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);

        ListNode reversed2 = solution.reverseList(head2);
        printList(reversed2); // Output: 2 -> 1

        // Example 3
        ListNode head3 = null;

        ListNode reversed3 = solution.reverseList(head3);
        printList(reversed3); // Output: null
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

