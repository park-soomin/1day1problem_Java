class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        
        int[] answer = {};
        int idx = 0;
        
        switch (n) {
            case 1:
                int[] result1 = new int[slicer[1] + 1];
                for (int i=0; i<=slicer[1]; i++) {
                    result1[i] = num_list[i];
                }
                return result1;
            case 2:
                int[] result2 = new int[num_list.length - slicer[0]];
                for (int i=slicer[0]; i<num_list.length; i++) {
                    result2[idx++] = num_list[i];
                }
                return result2;
            case 3:
                int[] result3 = new int[slicer[1] - slicer[0] + 1];
                for (int i=slicer[0]; i<=slicer[1]; i++) {
                    result3[idx++] = num_list[i];
                }
                return result3;
            case 4:
                int[] result4 = new int[(slicer[1] - slicer[0]) / slicer[2] + 1];
                for (int i=slicer[0]; i<=slicer[1]; i+=slicer[2]) {
                    result4[idx++] = num_list[i];
                }
                return result4;
        }
        
        
        return answer;
    }
}