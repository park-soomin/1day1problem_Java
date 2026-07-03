import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int solution(int[] sides) {
        
        HashSet<Integer> set = new HashSet<>();
        int answer = 0;
        
        Arrays.sort(sides);
        
        for (int i=sides[1]; i<sides[0]+sides[1]; i++) {
            if (i < sides[0] + sides[1]) answer++;
        }
        
        for (int j=1; j<sides[1]; j++) {
            if (sides[1] < sides[0] + j) answer++;
        }
        
        return answer;
    }
}