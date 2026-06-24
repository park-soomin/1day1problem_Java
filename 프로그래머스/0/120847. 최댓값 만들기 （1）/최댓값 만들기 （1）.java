class Solution {
    public int solution(int[] numbers) {
        int firMax = -1;
        int secMax = -1;
        
        for (int num : numbers) {
            if (num > firMax) {
                secMax = firMax;
                firMax = num;
            } else if (num > secMax) {
                secMax = num;
            }
        }
        
        return firMax * secMax;
    }
}