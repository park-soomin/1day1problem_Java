class Solution {
    public int solution(String myString, String pat) {

        myString = myString.replace("A", "b");
        myString = myString.replace("B", "a");
        myString = myString.toUpperCase();
        
        if (myString.contains(pat)) {
            return 1;
        }
        
        return 0;
    }
}