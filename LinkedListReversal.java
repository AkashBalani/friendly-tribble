public class LinkedListReversal {
    public static LinkedListNode[] reverse(LinkedListNode head, int k){
        LinkedListNode prev = null;
        LinkedListNode curr = head;
        LinkedListNode next = head;
        for (int i = 0; i < k; i++) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return new LinkedListNode[]{prev, curr};
    }
}
