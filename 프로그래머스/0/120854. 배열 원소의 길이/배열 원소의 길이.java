class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        
        int i = 0;
        for (String val : strlist) {
            answer[i++] = val.length();
        }
        
        return answer;
    }
}