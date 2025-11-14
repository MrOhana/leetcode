package linkedlist;

import linkedlist.base.ListNode;

public class MergeLinkedList {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newLl = null;

        // Implement rule here

        return newLl;
    }

    static void main() {
        var n4 = new ListNode(4, null);
        var n2 = new ListNode(2, n4);
        var n1 = new ListNode(1, n2);

        var n24 = new ListNode(4, null);
        var n23 = new ListNode(3, n24);
        var n21 = new ListNode(1, n23);

        ListNode middle = (new MiddleLinkedList()).middleNode(n1);
        while (middle != null) {
            System.out.println(middle.val + " ");
            middle = middle.next;
        }
    }
}

/**
Example 1:
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Example 2:
Input: list1 = [], list2 = []
Output: []

Example 3:
Input: list1 = [], list2 = [0]
Output: [0]
 */