class Solution {
    public int solution(int a, int b, int c) {
        
        int answer = 0;
        int sum = a + b + c;
        int sqrdSum = a*a + b*b + c*c;
        int cubicSum = a*a*a + b*b*b + c*c*c;
        
        if (a != b && a != c && b != c) {
            answer = sum;
        } else if (a==b && b==c) {
            answer = sum * sqrdSum * cubicSum;
        } else {
            answer = sum * sqrdSum;
        }
        
        return answer;
    }
}