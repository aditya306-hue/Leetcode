/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        // long binaryNum = head.val;
        // while(head.next != null){
        //     binaryNum = binaryNum * 10 + head.next.val;
        //     head = head.next;
        // }
        // int n = 0;
        // int pow = 0;
        // while(binaryNum != 0){
        //     n += ( binaryNum % 10 ) * Math.pow(2 , pow++);
        //     binaryNum /= 10;
        // }
        // return n;
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        size--;
        int n = 0;

        while(head != null){
            n += Math.pow(2  , size--) * (head.val);
            head = head.next;
        }
        return n;
    }
}