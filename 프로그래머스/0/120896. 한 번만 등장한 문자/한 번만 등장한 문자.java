class Solution {
    public String solution(String s) {
        
        StringBuilder sb = new StringBuilder();
        
        int[] int_arr = new int[26];
        
        for (int j=0; j<s.length(); j++) {
            int_arr[s.charAt(j) - 'a']++;
        }
        
        for (int k=0; k<int_arr.length; k++) {
            if (int_arr[k] == 1) {
                sb.append((char)(k + 'a'));
            }
        }

        return sb.toString();
    }
}