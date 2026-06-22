import java.util.HashMap;

class Solution {
    public String solution(String letter) {
        String[] codes = letter.split(" ");
        
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        HashMap<String, Character> map = new HashMap<>();
        for (int i=0; i<morse.length; i++) {
            map.put(morse[i], (char)('a' + i));
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<codes.length; i++) {
            sb.append(map.get(codes[i]));
        }
        
        return sb.toString();
    }
}