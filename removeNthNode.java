public class removeNthNode {
    public static LinkedListNode removeNthLastNode(LinkedListNode head, int n) {
        
        LinkedListNode left, right;
        left = head;
        right = head;
        int flag = 0;
        while(n > 0){
            n--;
            if(right.next == null){
                flag = 1;
                break;
            }
            right = right.next;
        }
        
        while(right.next != null){
            left = left.next;
            right = right.next;
        }
        if(flag == 1)
            return left.next;
        if(left.next.next != null)
            left.next = left.next.next;
        else
            left.next = null;

        return head;
    }
}
