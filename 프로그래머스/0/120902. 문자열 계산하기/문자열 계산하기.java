class Solution {
    public int solution(String my_string) {
        
        String[] str = my_string.split(" ");
        
        int result = Integer.parseInt(str[0]);
        for (int i=2; i<str.length; i+=2) {
            
            if (str[i-1].equals("+")) {
                result += Integer.parseInt(str[i]);
            } 
            else if (str[i-1].equals("-")) {
                result -= Integer.parseInt(str[i]);
            }
            
        }
        
        return result;
    }
}