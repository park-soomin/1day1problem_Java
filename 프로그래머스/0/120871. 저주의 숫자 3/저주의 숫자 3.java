class Solution {
    public int solution(int n) {

        int index = 1; int num = 1;
        
        while (index != n) {
            num++;
            
            if (num%3==0 || String.valueOf(num).contains("3")) {
                continue;
            }
            
            index++;
        }

        return num;
    }
}