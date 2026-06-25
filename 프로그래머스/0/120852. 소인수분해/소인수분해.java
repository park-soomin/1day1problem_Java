import java.util.HashSet;
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        HashSet<Integer> set = new HashSet<>();
        
        while (n > 1) {
            for (int i=2; i<=n; i++)  {
                if (n % i == 0) {
                    set.add(i);
                    n /= i;
                    break;
                } 
            }
        }
        
        int[] result = new int[set.size()];
        
        int j=0;
        for (int val : set) {
            result[j++] = val;
        }
        
        Arrays.sort(result);
        
        return result;
    }
}