class Solution {
    public int solution(int i, int j, int k) {
        
        int answer = 0;
        
        for (int a = i; a<=j; a++) {
            String num = Integer.toString(a);
            String digit = Integer.toString(k);
            
            for (int idx=0; idx < num.length(); idx++) {
                if (num.charAt(idx) == digit.charAt(0)) {
                    answer++;
                }
            }
        }
        
        return answer;
        
    }
}