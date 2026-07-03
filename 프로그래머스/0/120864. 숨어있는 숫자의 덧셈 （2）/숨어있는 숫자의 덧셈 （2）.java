class Solution {
    public int solution(String my_string) {
        
        String[] my_str = my_string.split("[a-zA-Z]");
        
        int sum = 0;
        for (String val : my_str) {
            if (!val.isEmpty()) {
                sum += Integer.parseInt(val);    
            }
        }
        
        return sum;
    }
}