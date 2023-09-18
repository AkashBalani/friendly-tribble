public class SwapPairs {
    public LinkedListNode swapPairs(LinkedListNode head) {
        LinkedListNode dummy = new LinkedListNode(-1);
        dummy.next = head;

        LinkedListNode prevNode = dummy;

        while(head != null && head.next != null){
            LinkedListNode firstNode = head;
            LinkedListNode secondNode = head.next;

            prevNode.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;

            prevNode = firstNode;
            head = firstNode.next;
        }

        return dummy.next;
    }
}
