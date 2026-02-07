class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        
        for (String op : operations) {
            if (op.equals("C")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (op.equals("D")) {
                if (!stack.isEmpty()) {
                    stack.push(stack.peek() * 2);
                }
            } else if (op.equals("+")) {
                if (stack.size() >= 2) {
                    int last = stack.pop();
                    int secondLast = stack.peek();
                    stack.push(last);
                    stack.push(last + secondLast);
                }
            } else {
                stack.push(Integer.parseInt(op));
            }
        }
        
        int total = 0;
        for (int score : stack) {
            total += score;
        }
        return total;
    }
}