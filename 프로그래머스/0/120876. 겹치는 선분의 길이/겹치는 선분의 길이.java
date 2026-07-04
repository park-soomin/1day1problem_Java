class Solution {
    public int solution(int[][] lines) {
        
        return overlap(lines[0], lines[1], lines[2]);
    }
    
    int overlap(int[] a, int[] b, int[] c) {
        int result = 0; int start = 0; int end = 0;
        
        start = Math.max(a[0], b[0]);
        end = Math.min(a[1], b[1]);
        if (end > start) result += end - start;
        
        start = Math.max(a[0], c[0]);
        end = Math.min(a[1], c[1]);
        if (end > start) result += end - start;
        
        start = Math.max(b[0], c[0]);
        end = Math.min(b[1], c[1]);
        if (end > start) result += end - start;
        
        start = Math.max(a[0], start);
        end = Math.min(a[1], end);
        if (end > start) result -= 2 * (end - start);
        
        return result;
    }
    
}