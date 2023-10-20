//package LL;
//
//public class MiddleOfLinkedList {
//    class Solution {
//        public ListNode middleNode(ListNode head) {
//            ListNode slow = head, fast = head;
//            while (fast != null && fast.next != null) {
//                slow = slow.next;
//                fast = fast.next.next;
//            }
//            return slow;
//        }
//    }
//    public ListNode middleNode(ListNode head) {
//        ListNode slow=head;
//        ListNode fast=head;
//        if(fast!=null && fast.next!=null){
//            slow=slow.next;
//            fast=fast.next.next;
//        }
//        return slow;
//    }
//}
//}
