class Solution {
    public int solution(int num, int k) {
        
        String n = "" + num;
        String[] num_str = n.split("");

        
        for (int i=0; i<num_str.length; i++) {
            if (Integer.parseInt(num_str[i]) == k) {
                return i+1;
            }
        }
        
        return -1;
        
    }
}