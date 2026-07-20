class Solution {
    public String push(String str) {
        int len = str.length();
        str = str.substring(len-1, len) + str.substring(0, len-1);
        return str;
    }
    
    public int solution(String A, String B) {
        
        int result = 0;
        
        for (int i=0; i<A.length(); i++) {
            if(B.equals(A)) {
                return result;
            } else {
                A = push(A);
                result++;
            }
        }
        
        return -1;
        
    }
}