class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        for (int i=0; i<included.length; i++) {
            if (included[i] == false) {
                continue;
            }
            answer += a + i * d;
        }
        
        return answer;
    }
}