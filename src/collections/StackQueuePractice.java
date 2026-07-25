package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackQueuePractice {
    // Given a string containing only '(', ')', '{', '}', '[', ']', determine whether it's valid. Valid means: every opening bracket is closed by the same type of bracket, and brackets are closed in the correct order (e.g., "([)]" is invalid even though it has matching counts of every bracket type).

    // Brute Force
    public static boolean isValidBrute(String s) {
        boolean removeSomething = true;
        while (removeSomething) {
            String before = s;
            s = s.replace("()", "").replace("{}", "").replace("[]", "");
            removeSomething = !s.equals(before);
        }
        return s.isEmpty();
    }

    //Optimised Approach using Stack - LIFO
    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                boolean mismatch = (c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[');
                if (mismatch) {
                    return false;
                }
            }
        }
        return s.isEmpty();
    }

    // Given a sequence of operations — an integer (record that score), "+" (record a score equal to the sum of the previous two), "D" (record double the previous score), or "C" (invalidate/remove the previous score) — return the sum of all valid scores at the end.
    public static int sumOfValidScores(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String op : operations) {
            switch (op) {
                case "+" -> {
                    int top = stack.pop();
                    int second = stack.peek();
                    stack.push(top);
                    stack.push(top + second);
                }
                case "D" -> stack.push(stack.peek() * 2);
                case "C" -> stack.pop();
                default -> stack.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        for (int v : stack) {
            sum += v;
        }
        return sum;
    }

    // Implement a FIFO queue using only stack operations (push/pop/peek from one end).
    public class MyQueue {
        private final Deque<Integer> inStack = new ArrayDeque<>();
        private final Deque<Integer> outStack = new ArrayDeque<>();

        public void push(int x) {
            inStack.push(x);
        }

        public int pop() {
            transferIfNeeded();
            return outStack.pop();
        }

        public int peek() {
            transferIfNeeded();
            return outStack.peek();
        }

        public boolean empty() {
            return inStack.isEmpty() && outStack.isEmpty();
        }

        public void transferIfNeeded() {
            if (outStack.isEmpty()) {
                while (!inStack.isEmpty()) {
                    outStack.push(inStack.pop());
                }
            }
        }
    }

    // Repeatedly remove pairs of adjacent, identical letters from a string until none remain. Return the final result.
    public static String removeAdjacentDuplicates(String s) {
        StringBuilder stack = new StringBuilder();
        for (char c : s.toCharArray()) {
            int lastIndex = stack.length() - 1;
            if (lastIndex >= 0 && stack.charAt(lastIndex) == c) {
                stack.deleteCharAt(lastIndex);
            } else {
                stack.append(c);
            }
        }
        return stack.toString();
    }
}