public class SwapNodes {
    public static LinkedListNode swapNodes(LinkedListNode head, int k) {
        LinkedListNode left = head;
        LinkedListNode right = head;
        LinkedListNode curr = head;
        for(int i = 0; i < k - 1; i++){
          left = left.next;
          curr = curr.next;
        }
  
        while(curr.next != null){
          right = right.next;
          curr = curr.next;
        }
  
        int temp = left.data;
        left.data = right.data;
        right.data = temp;
      // Replace this placeholder return statement with your code
      
      return head;
    }
}
