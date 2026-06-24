class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i=1; i<=n; i++) {
            for (int j=(int)Math.sqrt(i); j>1; j--) {
                if (i % j == 0) {
                    answer++;
                    break;
                }
            }
        }
        
        return answer;
    }
}