class Solution {
    public String[] solution(String my_str, int n) {
        
        int length = my_str.length() / n;
        if (my_str.length() % n != 0) length++;
        
        String[] result = new String[length];
        
        for (int i=0; i<my_str.length(); i+=n) {
            result[i/n] = my_str.substring(i, Math.min(i+n, my_str.length()));
        }
        
        return result;
    }
}