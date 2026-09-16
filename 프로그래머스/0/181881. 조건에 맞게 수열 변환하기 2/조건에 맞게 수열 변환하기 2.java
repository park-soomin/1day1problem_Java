import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        
        int answer = 0;
        int[] newArr = new int[arr.length];
        
        while (true) {
            for (int i=0; i<arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    newArr[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    newArr[i] = 2 * arr[i] + 1;
                } else {
                    newArr[i] = arr[i];
                }
            }
        
            if (Arrays.equals(newArr, arr)) {
                return answer;
            } else {
                arr = Arrays.copyOf(newArr, newArr.length);
                answer++;
            }
        }
    }
}