class Solution {
    public int getGCD(int a, int b) {
        if (a % b == 0) return b;
        return getGCD(b, a%b);
    }
    
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int denom = denom1 * denom2;
        int numer = numer1 * denom2 + numer2 * denom1;
        
        int gcd = getGCD(denom, numer);
        
        int[] answer = {numer/gcd, denom/gcd};
        
        return answer;
    }
}