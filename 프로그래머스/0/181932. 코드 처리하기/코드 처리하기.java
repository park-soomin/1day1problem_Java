class Solution {
    public String solution(String code) {
        
        StringBuilder sb = new StringBuilder();
        int mode = 0;
        
        for (int idx=0; idx<code.length(); idx++) {
            char current = code.charAt(idx);
            
            if (current == '1') {
                mode = (mode == 0) ? 1 : 0;
                continue;
            }
            
            if (idx % 2 == mode) {
                sb.append(current);
            }
        }
        
        return sb.length() == 0 ? "EMPTY" : sb.toString();
    }
}