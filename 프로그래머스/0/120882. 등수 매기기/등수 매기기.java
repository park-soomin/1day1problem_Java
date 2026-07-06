class Solution {
    public int[] solution(int[][] score) {
        
        int len = score.length;
        
        int[] sum = new int[len];
        int[] result = new int[len];
        
        for (int i=0; i<len; i++) {
            sum[i] = score[i][0] + score[i][1];
        }
        
        for (int j=0; j<len; j++) {
            int rank = 1;
            for (int k=0; k<len; k++) {
                if (sum[j] < sum[k]) {
                    rank++;
                }
            }
            result[j] = rank;
        }
        
        return result;
    }
}