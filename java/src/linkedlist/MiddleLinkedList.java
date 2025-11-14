// Chalenge: https://leetcode.com/problems/middle-of-the-linked-list/description/?envType=problem-list-v2&envId=linked-list

package linkedlist;

import linkedlist.base.ListNode;

public class MiddleLinkedList {

    public ListNode middleNode(ListNode head) {
        ListNode middle = head;

        while (head != null && head.next != null) {
            middle = middle.next;
            head = head.next.next;
        }

        return middle;
    }

    static void main() {
        var n6 = new ListNode(6, null);
        var n5 = new ListNode(5, n6);
        var n4 = new ListNode(4, n5);
        var n3 = new ListNode(3, n4);
        var n2 = new ListNode(2, n3);
        var n1 = new ListNode(1, n2);

        ListNode middle = (new MiddleLinkedList()).middleNode(n1);
        while (middle != null) {
            System.out.println(middle.val + " ");
            middle = middle.next;
        }
    }
}

/**
Example 1:
Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.


Example 2:
Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.

*/