class Solution {
    public int solution(int[] sides) {
        
        int max_index = 0;
        for (int i=1; i<3; i++) {
            if (sides[max_index] < sides[i]) {
                max_index = i;
            }
        }
        
        int sum = sides[0] + sides[1] + sides[2];
        if (sum - 2*sides[max_index] > 0) return 1;
        else return 2;
        
    }
}