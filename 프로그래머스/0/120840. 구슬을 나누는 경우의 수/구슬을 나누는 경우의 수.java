class Solution {
    int[][] memo = new int[31][31];

    int binom(int n, int k) {
        if (k == 0 || k == n) return 1;
        if (memo[n][k] != 0) return memo[n][k];
        memo[n][k] = binom(n-1, k) + binom(n-1, k-1);
        return memo[n][k];
    }
    
    
    public int solution(int balls, int share) {
        return binom(balls, share);
    }
}