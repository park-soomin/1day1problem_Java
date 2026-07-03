class Solution {
    public int solution(int[][] board) {
        
        int answer = 0;
        int[][] dangerZone = new int[board.length+2][board.length+2];
        
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board.length; j++) {
                if (board[i][j] == 1) {
                    dangerZone[i][j] = 1;
                    dangerZone[i][j+1] = 1;
                    dangerZone[i][j+2] = 1;
                    dangerZone[i+1][j] = 1;
                    dangerZone[i+1][j+1] = 1;
                    dangerZone[i+1][j+2] = 1;
                    dangerZone[i+2][j] = 1;
                    dangerZone[i+2][j+1] = 1;
                    dangerZone[i+2][j+2] = 1;
                }
            }
        }
        
        for (int i=1; i<dangerZone.length-1; i++) {
            for (int j=1; j<dangerZone.length-1; j++) {
                if (dangerZone[i][j] == 0) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}