class Solution {
    public String[] solution(String[] quiz) {
        
        String[] result = new String[quiz.length];
        int i = 0;
        
        for (String q : quiz) {
            String[] fomula = q.split(" ");

            int x = Integer.parseInt(fomula[0]);
            int y = Integer.parseInt(fomula[2]);
            int z = Integer.parseInt(fomula[4]);
            
            if (fomula[1].equals("+")) {
                if (x + y == z) result[i++] = "O";
                else result[i++] = "X";
            } 
            else {
                if (x - y == z) result[i++] = "O";
                else result[i++] = "X";
            }
        }
        
        return result;
    }
}