import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] query) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int val : arr) {
            list.add(val);
        }
        
        for (int i=0; i<query.length; i++) {
            int q = query[i];
            
            if (i % 2 == 0) {
                for (int j=list.size()-1; j>q; j--) {
                    list.remove(j);
                }
            } else {
                for (int k=0; k<q; k++) {
                    list.remove(0);
                }
            }
        }
        
        return list.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}