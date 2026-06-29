class Solution {
    public String solution(String s) {
        
        StringBuilder sb = new StringBuilder();
        
        int[] int_arr = new int[27];
        for (int i=0; i<27; i++) {
            int_arr[i] = 0;
        }
        
        for (int j=0; j<s.length(); j++) {
            int_arr[s.charAt(j) - 96]++;
        }
        
        for (int k=0; k<int_arr.length; k++) {
            if (int_arr[k] == 1) {
                sb.append((char)(k + 96));
            }
        }

        return sb.toString();
    }
}