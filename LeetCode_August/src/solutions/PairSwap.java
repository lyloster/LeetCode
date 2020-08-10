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
            if (head == null) {
                return null;
            } else if (head.next == null) {
                return head;
            } else {
                ListNode newHead = head.next;
                swapPairsInt(head);
                return newHead;
            }

        }

    private static ListNode swapPairsInt(ListNode head) {
            if (head == null || head.next == null) { //?
                return head;
            }
            System.out.println(head.val);
            print(head);
            ListNode newHead = swapNodes(head);
            System.out.println(newHead.val);
            print(newHead);
            System.out.println("head.next.next == " + head.next.next.val);
            ListNode toConnect = swapPairsInt(head.next.next);
            newHead.next = toConnect;
            return newHead;

        }

        private static ListNode swapNodes(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            System.out.println("head == " + head.val + " head.next == " + head.next.val);
            ListNode temp = head;
            //ListNode temp = new ListNode(head.val, head.next);
            head = head.next;
            head.next = temp;
            System.out.println("head == " + head.val + " head.next == " + head.next.val);
            return head;

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
            ListNode h3 = new ListNode(1, h4);
            ListNode h2 = new ListNode(1,h3);
            ListNode h1 = new ListNode(1,h2);
            swapPairsInt(h1);
        }
    //     private void swapPairsInt(final ListNode head) {
//         if (head == null || head.next == null) {
//             return;
//         }
//         System.out.println(head.val);
//         print(head);
//         swapNodes(head, head.next);
//         swapPairsInt(head.next);

//     }

//     private void swapNodes(final ListNode head, final ListNode nextNode) {
//         ListNode temp = nextNode.next;
//         nextNode.next = head;
//         head.next = temp;
//     }
}
