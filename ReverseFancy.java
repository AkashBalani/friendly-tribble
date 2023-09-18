import java.util.Arrays;
import java.util.List;

public class ReverseFancy {
    public static LinkedListNode reverseLinkedListNode(LinkedListNode head){
        LinkedListNode prev = head;
        LinkedListNode node, reverse, currNext, curr, prevNext = null;
        int groupLen = 2;
        int numNodes = 0;
        while(prev.next!=null){
            node = prev;
            numNodes = 0;
            for(int i = 0; i < groupLen; i++){
                if(node.next == null)
                    break;
                numNodes++;
                node = node.next;
            }

            if(groupLen % 2 != 0){
                prev = node;
            }
            else{
                reverse = node.next;
                curr = prev.next;
                for(int j = 0; j < numNodes; j++){
                    currNext = curr.next;
                    curr.next = reverse;
                    reverse = curr;
                    curr = currNext;
                }
                prevNext = prev.next;
                prev.next = node;
                prev = prevNext;
            }
            groupLen++;
        }
        return head;
    }
    public static void main(String[] args) {
        // LinkedList list = new LinkedList();
        List<Integer> inputList = Arrays.asList(5, 2, 6, 3, 9, 1, 7, 3);

        LinkedList inputLinkedList1 = new LinkedList();
        inputLinkedList1.createLinkedList(inputList);

        LinkedListNode resHead = reverseLinkedListNode(inputLinkedList1.head);

        while(resHead!=null){
            System.out.println(resHead.data + " -> ");
            resHead = resHead.next;
        }
            
    }
}
