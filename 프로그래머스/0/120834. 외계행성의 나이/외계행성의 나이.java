class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        
        while (age > 0) {
            int n = age % 10;
            age /= 10;
            
            switch (n) {
                case 0: sb.insert(0, "a");
                    break;
                case 1: sb.insert(0, "b");
                    break;
                case 2: sb.insert(0, "c");
                    break;
                case 3: sb.insert(0, "d");
                    break;
                case 4: sb.insert(0, "e");
                    break;
                case 5: sb.insert(0, "f");
                    break;
                case 6: sb.insert(0, "g");
                    break;
                case 7: sb.insert(0, "h");
                    break;
                case 8: sb.insert(0, "i");
                    break;
                case 9: sb.insert(0, "j");
                    break;
            }
        }

        return sb.toString();
    }
}