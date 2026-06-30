class Solution {
    public String[] solution(String[] quiz) {
        
        int i = 0;
        
        for (String q : quiz) {
            String[] fomula = q.split(" ");

            int x = Integer.parseInt(fomula[0]);
            int y = Integer.parseInt(fomula[2]);
            int z = Integer.parseInt(fomula[4]);
            
            if (fomula[1].equals("+")) {
                if (x + y == z) quiz[i++] = "O";
                else quiz[i++] = "X";
            } 
            else {
                if (x - y == z) quiz[i++] = "O";
                else quiz[i++] = "X";
            }
        }
        
        return quiz;
    }
}