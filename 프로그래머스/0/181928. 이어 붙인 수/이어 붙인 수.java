class Solution {
    public int solution(int[] num_list) {
        
        String odd = "";
        String even = "";
        
        for (int i=0; i<num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                even += num_list[i];
            } else {
                odd += num_list[i];   
            }
        }
        
        if (even.equals("")) {
            even = "0";
        } else if (odd.equals("")) {
            odd = "0";
        }
        
        int answer = Integer.parseInt(even) + Integer.parseInt(odd);
        
        return answer;
    }
}