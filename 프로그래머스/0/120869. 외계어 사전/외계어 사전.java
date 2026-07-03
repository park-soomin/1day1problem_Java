class Solution {
    public int solution(String[] spell, String[] dic) {
        
        int answer = 2;
        
        for (String word : dic) {
            if (answer == 1) break;
            
            for (int i=0; i<spell.length; i++) {
                if (word.contains(spell[i])) {
                    answer = 1;
                    continue;
                }
                answer = 2;
                break;
            }
        }
        
        
        return answer;
    }
}