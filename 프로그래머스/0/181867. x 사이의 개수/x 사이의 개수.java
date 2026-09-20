import java.util.ArrayList;

class Solution {
    public int[] solution(String myString) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int cnt = 0;
        for (int i=0; i<myString.length(); i++) {
            if (myString.charAt(i) == 'x') {
                list.add(cnt);
                cnt = 0;
                if (i == myString.length()-1) {
                    list.add(0);
                }
            } else {
                cnt++;
            }
        }
        
        if (cnt != 0) list.add(cnt);
        
        return list.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}