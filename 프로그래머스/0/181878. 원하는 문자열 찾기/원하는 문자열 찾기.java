class Solution {
    public int solution(String myString, String pat) {
        
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        
        int len = myString.length()-pat.length();
        if (len < 0) return 0;
        
        for (int i=0; i<len+1; i++) {
            if (pat.equals(myString.substring(i,i+pat.length()))) {
                return 1;
            }
        }
        
        return 0;
    }
}