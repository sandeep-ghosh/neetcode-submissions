class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (String s : tokens) {
            if (s.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (s.equals("-")) {
                int op2 = stack.pop();
                int op1 = stack.pop();
                int minus = op1 - op2;
                stack.push(minus);
            } else if (s.equals("*")) {
                int mult = stack.pop() * stack.pop();
                stack.push(mult);
            } else if (s.equals("/")) {
                int op2 = stack.pop();
                int op1 = stack.pop();
                int div = op1 / op2;
                stack.push(div);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}
