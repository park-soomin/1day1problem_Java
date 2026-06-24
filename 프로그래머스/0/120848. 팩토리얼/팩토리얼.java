class Solution {
    public int solution(int n) {
        int mul = 1;
        int i = 1;
        
        while (mul < n) {
            mul *= i;
            if (mul > n) {
                i--;
                break;
            } else if (mul == n) {
                break;
            }
            i++;
        }
        
        return i;
    }
}