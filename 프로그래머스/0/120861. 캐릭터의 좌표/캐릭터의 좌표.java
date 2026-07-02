class Solution {
    public int[] solution(String[] keyinput, int[] board) {

        int[] result = {0, 0};
        
        for (int i=0; i<keyinput.length; i++) {
            switch(keyinput[i]) {
                case("up"):
                    if (result[1] == (board[1] - 1)/2) break;
                    result[1]++;
                    break;
                case("down"):
                    if (result[1] == -(board[1] - 1)/2) break;
                    result[1]--;
                    break;
                case("left"):
                    if (result[0] == -(board[0] - 1)/2) break;
                    result[0]--;
                    break;
                case("right"):
                    if (result[0] == (board[0] - 1)/2) break;
                    result[0]++;
                    break;
            }
        }
        
        return result;
    }
}