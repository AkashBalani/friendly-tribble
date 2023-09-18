public class ReorderList {
    public static LinkedListNode reorderList(LinkedListNode head) {
    
        LinkedListNode dummy = head;
        LinkedListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
          slow = slow.next;
          fast = fast.next.next;
        }
    
        LinkedListNode mid = slow.next;
        slow.next = null;
        mid = reverse(mid);
    
        while(mid != null){
          LinkedListNode t1 = head.next;
          LinkedListNode t2 = mid.next;
    
          head.next = mid;
          mid.next = t1;
    
          head = t1;
          mid = t2;
        }
    
    
        return dummy;
      }
    
      public static LinkedListNode reverse(LinkedListNode head){
        LinkedListNode prev = null, next = null;
        LinkedListNode curr = head;
        while(curr != null){
          next = curr.next;
          curr.next = prev;
          prev = curr;
          curr = next;
        }
        return prev;
      }
}
