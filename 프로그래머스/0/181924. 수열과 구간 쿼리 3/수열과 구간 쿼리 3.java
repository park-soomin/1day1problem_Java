class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for (int n=0; n<queries.length; n++) {
            int i = queries[n][0];
            int j = queries[n][1];
            
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        return arr;
    }
}