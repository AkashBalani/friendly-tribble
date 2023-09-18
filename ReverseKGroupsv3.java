import java.util.Arrays;
import java.util.List;

public class ReverseKGroupsv3 {
    public static LinkedListNode reverse(LinkedListNode head, int k){
        LinkedListNode dummy = new LinkedListNode(-1);
        dummy.next = head;
        LinkedListNode prev = dummy;
        LinkedListNode curr = prev.next;
        int currLen = 1;

        int listLen = 0;
        while(curr != null){
            curr = curr.next;
            listLen++;
        }
        curr = prev.next;

        while(curr != null){
            while(currLen < k && listLen >= k){
                LinkedListNode next = curr.next;
                curr.next = next.next;
                next.next = prev.next;
                prev.next = next;
                currLen++;
                listLen--;
            }
            prev = curr;
            curr = curr.next;
            currLen = 1;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5, 6);

        LinkedList inputLinkedList1 = new LinkedList();
        inputLinkedList1.createLinkedList(inputList);

        LinkedListNode resHead = reverse(inputLinkedList1.head, 3);

        while(resHead!=null){
            System.out.println(resHead.data + " -> ");
            resHead = resHead.next;
        }
    }
}
