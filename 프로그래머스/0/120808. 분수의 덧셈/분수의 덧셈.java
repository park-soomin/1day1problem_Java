class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int denom = 0;
        
        if (denom1 == denom2) {
            denom = denom1;
        } else {
            denom = denom1 * denom2;
            numer1 *= denom / denom1;
            numer2 *= denom / denom2;
        }
        int numer = numer1 + numer2;
        
        int a,b = 0;
        if (numer >= denom) {
            a = numer;
            b = denom;
        } else {
            a = denom;
            b = numer;
        }
        
        while(true) {
            if (a%b == 0) {
                break;
            } else {
                int temp = a;
                a = b;
                b = temp%b;
            }
        }
        
        int[] answer = {numer/b, denom/b};
        
        return answer;
    }
}