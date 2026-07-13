class Solution {
    public int solution(int chicken) {
        
        int answer = 0;
        int rest = 0;
        
        while (chicken >= 10) {
            answer += chicken / 10;
            rest += chicken % 10;
            
            while (rest >= 10) {
                answer++;
                rest -= 10;
            }
            
            chicken = chicken / 10 + rest;
            rest = 0;
        }
        
        return answer;
    }
}