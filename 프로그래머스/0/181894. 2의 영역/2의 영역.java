class Solution {
    public int[] solution(int[] arr) {
        
        int[] answer = {-1};
        int src_idx = 0; int dest_idx = -1;
        
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == 2) {
                src_idx = i;
                break;
            }
        }   
        
        for (int i=arr.length-1; i>=0; i--) {
            if (arr[i] == 2) {
                dest_idx = i;
                break;
            }
        }     
        
        if (src_idx <= dest_idx) {
            int[] result = new int[dest_idx - src_idx + 1];
            System.arraycopy(arr, src_idx, result, 0,
                        dest_idx - src_idx + 1);
            return result;
        }
        
        return answer;
    }
}