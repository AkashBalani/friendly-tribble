public class LinkedListCycle {
    public static boolean detectCycle(LinkedListNode head){
        LinkedListNode slow = head;
        LinkedListNode fast = head.next;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                return true;
        }
        return false;
    }
}
