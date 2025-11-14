// Challenge: https://leetcode.com/problems/reverse-linked-list/description/

package linkedlist;

import linkedlist.base.ListNode;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode node = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = node;
            node = head;
            head = temp;
        }

        return node;
    }

    static void main() {
        var n5 = new ListNode(5, null);
        var n4 = new ListNode(4, n5);
        var n3 = new ListNode(3, n4);
        var n2 = new ListNode(2, n3);
        var n1 = new ListNode(1, n2);

        ListNode newHead = (new ReverseLinkedList()).reverseList(n1);
        while (newHead != null) {
            System.out.println(newHead.val + " ");
            newHead = newHead.next;
        }
    }
}


/**
Example 1:
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]


Example 2:
Input: head = [1,2]
Output: [2,1]


Example 3:
Input: head = []
Output: []
*/