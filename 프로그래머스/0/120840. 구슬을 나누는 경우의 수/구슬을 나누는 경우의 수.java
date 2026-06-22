class Solution {
    public int binom(int n, int k) {
        if (k == 0) return 1;
        if (k == n) return 1;
        return binom(n-1, k) + binom(n-1, k-1);
    }
    
    
    public int solution(int balls, int share) {
        return binom(balls, share);
    }
}