class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int i = 0;
        for (int j=0; j<k; j++) {
            if (i >= numbers.length) {
                i -= numbers.length;
            }
            answer = numbers[i];
            i += 2;
        }
        return answer;
    }
}