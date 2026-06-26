import java.util.Stack;

class Solution {
    public int solution(String s) {
        Stack<Integer> stack = new Stack<>();
        
        String[] str = s.split(" ");
        
        for (String val : str) {
            if (val.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(val));
            }
        }
        
        int answer = 0;
        while (!stack.isEmpty()) {
            answer += stack.peek();
            stack.pop();
        }
        
        return answer;
    }
}