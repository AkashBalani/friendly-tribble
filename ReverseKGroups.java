import java.util.Arrays;
import java.util.List;

public class ReverseKGroups {
    public static LinkedListNode reverseKGroup(LinkedListNode head, int k){
        if(k <= 1)
            return head;
        
        int listLen = 0;
        LinkedListNode curr = head;
        while(curr != null){
            listLen++;
            curr = curr.next;
        }

        LinkedListNode dummy = new LinkedListNode(0);
        dummy.next = head;
        LinkedListNode ptr = dummy;
        LinkedListNode prev = null, next = null;
        while(ptr != null){
            LinkedListNode track = ptr;
            for(int i = 0; i < k; i++){
                if(track == null)
                    break;
                track = track.next;
            }

            if(track == null)
                break;

            LinkedListNode[] nodes = LinkedListReversal.reverse(ptr.next, k);
            LinkedListNode previous = nodes[0];
            LinkedListNode current = nodes[1];

            LinkedListNode lastNodeOfReversedGroup = ptr.next;
            lastNodeOfReversedGroup.next = current;
            ptr.next = previous;
            ptr = lastNodeOfReversedGroup;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5);

        LinkedList inputLinkedList1 = new LinkedList();
        inputLinkedList1.createLinkedList(inputList);

        LinkedListNode resHead = reverseKGroup(inputLinkedList1.head, 3);

        while(resHead!=null){
            System.out.println(resHead.data + " -> ");
            resHead = resHead.next;
        }
    }
}
