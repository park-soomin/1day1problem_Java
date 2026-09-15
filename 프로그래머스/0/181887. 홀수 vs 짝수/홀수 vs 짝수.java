class Solution {
    public int solution(int[] num_list) {
        
        int evenSum = 0; int oddSum = 0;
        
        for (int i=0; i<num_list.length; i+=2) {
            oddSum += num_list[i];
        }
        for (int j=1; j<num_list.length; j+=2) {
            evenSum += num_list[j];
        }
        
        return (oddSum >= evenSum) ? oddSum : evenSum;
    }
}