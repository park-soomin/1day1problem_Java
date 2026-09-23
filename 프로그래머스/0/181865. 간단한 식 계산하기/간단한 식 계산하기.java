class Solution {
    public int solution(String binomial) {

        String[] arr = binomial.split(" ");
        
        int result = 0;
        if (arr[1].equals("+")) {
            result = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
        } else if (arr[1].equals("-")) {
            result = Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
        } else {
            result = Integer.parseInt(arr[0]) * Integer.parseInt(arr[2]);
        }
        
        return result;
    }
}