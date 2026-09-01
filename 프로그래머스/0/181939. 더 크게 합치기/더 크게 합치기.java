class Solution {
    public int solution(int a, int b) {
        int result1 = Integer.parseInt(String.valueOf(a) 
                                       + String.valueOf(b));
        int result2 = Integer.parseInt(String.valueOf(b) 
                                       + String.valueOf(a));
        
        int answer;
        if (result1 > result2) {
            answer = result1;
        } else {
            answer = result2;
        }
        
        return answer;
    }
}