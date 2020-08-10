package solutions;

public class PairSwap {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        //print(head);
        ListNode newHead = swapNodes(head);
        //print(newHead);
        ListNode toConnect = swapPairs(head.next);
        newHead.next.next = toConnect;
        return newHead;
    }

    private static ListNode swapNodes(final ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // System.out.println("head == " + head.val + " head.next == " + head.next.val);
        ListNode temp = head.next;
        head.next = head.next.next;
        temp.next = head;
        return temp;
    }

    private static void print(final ListNode head) {
        ListNode h = head;
        while (h != null) {
            System.out.print(h.val + " ");
            h = h.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        ListNode h4 = new ListNode(1, null);
        ListNode h3 = new ListNode(2, h4);
        ListNode h2 = new ListNode(3,h3);
        ListNode h1 = new ListNode(4,h2);
        h1 = swapPairs(h1);
        print(h1);
    }
}
