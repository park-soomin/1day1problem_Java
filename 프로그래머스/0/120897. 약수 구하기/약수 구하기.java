import java.util.TreeSet;

class Solution {
    public int[] solution(int n) {
        
        TreeSet<Integer> set = new TreeSet<>();
        
        int div = (int)Math.sqrt(n);
        
        for (int i=div; i>0; i--) {
            if (n % i == 0) {
                set.add(i);
                set.add(n/i);
            }
        }
        
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}