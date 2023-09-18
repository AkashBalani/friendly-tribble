import java.util.Arrays;
import java.util.List;

public class ReverseKGroupsv2 {
    public static LinkedListNode reverse(LinkedListNode head, int left, int right){
        LinkedListNode dummy = new LinkedListNode(-1);
        dummy.next = head;
        LinkedListNode prev = dummy;

        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }

        LinkedListNode curr = prev.next;

        for (int i = 0; i < right - left; i++) {
            LinkedListNode next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5);

        LinkedList inputLinkedList1 = new LinkedList();
        inputLinkedList1.createLinkedList(inputList);

        LinkedListNode resHead = reverse(inputLinkedList1.head, 2, 4);

        while(resHead!=null){
            System.out.println(resHead.data + " -> ");
            resHead = resHead.next;
        }
    }
}
