import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        
        String lower = my_string.toLowerCase();
        
        String[] answer = lower.split("");
        Arrays.sort(answer);
        
        StringBuilder sb = new StringBuilder();
        for (String c : answer) {
            sb.append(c);
        }
        
        return sb.toString();
    }
}