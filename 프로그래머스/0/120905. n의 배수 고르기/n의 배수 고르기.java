class Solution {
    public int[] solution(int n, int[] numlist) {
        
        int cnt = 0;
        
        for (int num : numlist) {
            if (num % n == 0) {
                cnt++;
            }
        }
        
        int[] result = new int[cnt];
        int i = 0;
        for (int j : numlist) {
            if (j % n == 0) {
                result[i++] = j;
            }
        }
        
        return result;
    }
}