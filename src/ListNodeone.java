import java.util.Arrays;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class ListNodeone {
    public static ListNode mergeTwoLists(ListNode h1, ListNode h2) {
        if (h1 == null) {
            return h2;
        }
        if (h2 == null) {
            return h1;
        }

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (h1 != null && h2 != null) {
            if (h1.val < h2.val) {
                current.next = h1;
                h1 = h1.next;
            } else {
                current.next = h2;
                h2 = h2.next;
            }
            current = current.next;
        }

        if (h1 != null) {
            current.next = h1;
        }
        if (h2 != null) {
            current.next = h2;
        }

        return dummy.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        ListNode h1 = new ListNode(1);
        h1.next = new ListNode(3);
        h1.next.next = new ListNode(5);


        ListNode h2 = new ListNode(2);
        h2.next = new ListNode(4);
        h2.next.next = new ListNode(6);
        h2.next.next.next = new ListNode(8);


        ListNode mergedList = mergeTwoLists(h1, h2);
        printList(mergedList);
    }
}


