class Solution {
    public String[] solution(String[] str_list) {
        
        String[] answer = {};
        
        for (int i=0; i<str_list.length; i++) {
            if (str_list[i].equals("l")) {
                String[] result1 = new String[i];
                System.arraycopy(str_list,0,result1,0,i);
                return result1;
            } 
            else if (str_list[i].equals("r")) {
                String[] result2 = new String[str_list.length-i-1];
                System.arraycopy(str_list,i+1,result2,0,str_list.length-i-1);
                return result2;
            }
        }
        
        return answer;
    }
}