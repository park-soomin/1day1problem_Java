class Solution {
    public String[] solution(String[] strArr) {

        for (int i=0; i<strArr.length; i+=2) {
            strArr[i] = strArr[i].toLowerCase();
        }
        
        for (int j=1; j<strArr.length; j+=2) {
            strArr[j] = strArr[j].toUpperCase();
        }
        
        return strArr;
    }
}