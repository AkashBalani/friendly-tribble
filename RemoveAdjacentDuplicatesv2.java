import java.util.Stack;

public class RemoveAdjacentDuplicatesv2 {
    public static String removeDuplicates(String str) {
        Stack <Character> stack = new Stack<>();

        for (char c: str.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }

        return result.toString();
    }
}
