public class MiddleLinkedList {
    public static LinkedListNode middleNode(LinkedListNode head){
        int len = 0;
        LinkedListNode slow = head;
        LinkedListNode fast = head;
        while(head != null){
            len++;
            head = head.next;
        }
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return (len % 2 == 1) ? slow : slow.next;
    }
}
