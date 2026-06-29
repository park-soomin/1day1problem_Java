class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int diff = 0;
        int min_diff = 200;
        
        for (int val : array) {
            diff = val - n;
            if (diff < 0) diff = -diff;
            
            if (diff < min_diff) {
                min_diff = diff;
                answer = val;
            } else if (diff == min_diff) {
                answer = (val < answer) ? val : answer; 
            }
        }
        
        return answer;
    }
}