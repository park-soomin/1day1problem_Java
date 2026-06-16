class Solution {
    public int solution(int[] array) {
        
        int[] count = new int[1000];
        for (int i=0; i<array.length; i++) {
            count[array[i]]++;
        }
        
        int max = count[0];
        int answer = 0;
        int maxCount = 0;
        for (int i=0; i<count.length; i++) {
            if (max < count[i]) {
                max = count[i];
                answer = i;
                maxCount = 1;
            } else if (max == count[i]) {
                maxCount++;
            }
        }
        
        if (maxCount > 1) answer = -1;
        
        return answer;
    }
}