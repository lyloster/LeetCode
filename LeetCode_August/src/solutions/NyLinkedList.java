package solutions;

class MyLinkedList {
    private static class ListNode {
       int val;
       ListNode next;

       ListNode (int val, ListNode next) {
           this.val = val;
           this.next = next;
       }
       ListNode (int val) {
            this.val = val;
       }
       ListNode () {}
    }

    ListNode head;
    int length;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        length = 0;
        head = null;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        ListNode h = head;
        if (index >= length) {
            return -1;
        }
        for (int i = 0; i < index; ++i) {
            h = h.next;
        }
        return h.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) { //?
        ListNode temp = new ListNode(val, head);
        head = temp;
        ++length;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if (head == null) {
            addAtHead(val);
            return;
        }

        ListNode h = head;
        while (h.next != null) {
            h = h.next;
        }
        ListNode temp = new ListNode(val, null);
        h.next = temp;
        ++length;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }
        ListNode h = head;
        if (index == length) {
            addAtTail(val);
        } else {
            for (int i = 0; i < index - 1; ++i) { //to previous node
                h = h.next;
            }
            ListNode temp = new ListNode(val);
            temp.next = h.next;
            h.next = temp;
            ++length;
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index >= length) {
            return;
        }
        ListNode h = head;
        if (index == 0) {
            head = head.next;
        } else {
            for (int i = 0; i < index - 1; ++i) {
                h = h.next;
            }
            h.next = h.next.next;
        }
        --length;
    }

    public void printLL() {
        ListNode h = head;
        for (int i = 0; i < length; ++i) {
            System.out.print(h.val + " --> ");
            h = h.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList(); // Initialize empty LinkedList
        linkedList.addAtHead(7);
        linkedList.printLL();
        linkedList.addAtHead(2);
        linkedList.printLL();
        linkedList.addAtHead(1);
        linkedList.printLL();
        linkedList.addAtIndex(3,0);
        linkedList.printLL();
        linkedList.deleteAtIndex(3);
        linkedList.printLL();
        linkedList.addAtHead(6);
        linkedList.printLL();
        linkedList.addAtTail(4);
        linkedList.printLL();
        System.out.println(linkedList.get(4));
        linkedList.addAtHead(4);
        linkedList.printLL();
        linkedList.addAtIndex(5, 0);
        linkedList.printLL();
        linkedList.addAtHead(6);
        linkedList.printLL();
    }
}
