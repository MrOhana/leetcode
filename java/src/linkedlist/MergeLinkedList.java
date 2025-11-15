package linkedlist;

import linkedlist.base.ListNode;

public class MergeLinkedList {

    /**
     * Aqui nessa estrutura eu sofri para entender que o curNode estava se movendo "por dentro" da estrutura de objetos
     * do result. Sem isso eu não criaria um rastro, estava apenas tentando criar uma sequência de novos
     * apontamentos dos Nodes, mas estava praticamente interando N vezes em l1 e l2, ou seja, tornando o algoritmo
     * com uma complexidade O(n2)
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode curNode = result;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curNode.next = l1;
                l1 = l1.next;
            } else {
                curNode.next = l2;
                l2 = l2.next;
            }
            curNode = curNode.next;
        }

        curNode.next = (l1 != null) ? l1 : l2;

        return result.next;
    }

    static void main() {
        var n3 = new ListNode(5, null);
        var n2 = new ListNode(5, n3);
        var n1 = new ListNode(1, n2);

        var n23 = new ListNode(9, null);
        var n22 = new ListNode(4, n23);
        var n21 = new ListNode(1, n22);

        ListNode middle = (new MergeLinkedList()).mergeTwoLists(n1, n21);
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