class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int odd = 1;
        
        if (n % 2 == 0) {
            answer = new int[n/2];
            for (int i=0; i<n/2; i++) {
                answer[i] = odd;
                odd += 2;
            }
        } else {
            answer = new int[n/2 + 1];
            for (int i=0; i<(n/2 + 1); i++) {
                answer[i] = odd;
                odd += 2;
            }
        } 
        
        return answer;
    }
}