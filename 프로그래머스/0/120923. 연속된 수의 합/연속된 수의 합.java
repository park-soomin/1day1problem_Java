class Solution {
    public int[] solution(int num, int total) {
        
        int[] result = new int[num];
        
        int mid = total / num;
        int start = (num % 2 == 0) ? mid-(num/2-1) : mid-num/2;
        
        for (int i=0; i<num; i++) {
            result[i] = start++;
        }
        
        return result;
    }
}