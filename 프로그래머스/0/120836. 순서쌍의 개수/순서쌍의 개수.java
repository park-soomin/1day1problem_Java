class Solution {
    public int solution(int n) {
        
        int root = (int) Math.sqrt(n);
        int result = 0;
        
        for (int i=1; i<=root; i++) {
            if (n%i == 0) {
                result += 2;
                if (n/i == root) {
                    result--;
                }
            }
        }
        
        return result;
    }
}