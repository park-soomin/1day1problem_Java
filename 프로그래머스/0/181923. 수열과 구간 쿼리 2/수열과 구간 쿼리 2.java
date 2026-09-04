class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        int[] answer = new int[queries.length];
        for (int n=0; n<queries.length; n++) {
            answer[n] = -1;
        }
        
        for (int i=0; i<queries.length; i++) {
            for (int j=queries[i][0]; j<=queries[i][1]; j++) {
                if (arr[j] > queries[i][2]) {
                    if (answer[i] < 0) {
                        answer[i] = arr[j];
                    } else {
                        answer[i] = (answer[i] > arr[j]) ? arr[j] : answer[i];
                    }
                }
            }
        }
        
        return answer;
    }
}