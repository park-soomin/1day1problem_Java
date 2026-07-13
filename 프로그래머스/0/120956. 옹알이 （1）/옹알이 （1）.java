class Solution {
    public int solution(String[] babbling) {
    
        int answer = 0;
        
        for (String bab : babbling) {
            bab = bab.replace("aya", " ").replace("ye", " ")
                .replace("woo", " ").replace("ma", " ");
            
            if (bab.replace(" ", "").isEmpty()) answer++;
        }
        
        return answer;
    }
}