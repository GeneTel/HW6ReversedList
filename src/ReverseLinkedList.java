public class ReverseLinkedList {
        public ListNode reverseList(ListNode head) {
            ListNode prev = null; // Initialize prev pointer to null
            ListNode current = head; // Set current pointer to head of the original list

            while (current != null) { // Iterate until current pointer reaches the end of the original list
                ListNode nextTemp = current.next; // Store the next node of current pointer
                current.next = prev; // Reverse the pointer of current node to point to the previous node
                prev = current; // Move prev pointer to current node
                current = nextTemp; // Move current pointer to the next node
            }

            return prev; // Return the new head of the reversed list
        }

    }
