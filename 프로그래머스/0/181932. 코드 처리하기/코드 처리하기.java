class Solution {
    public String solution(String code) {
        
        String ret = "";
        int mode = 0;
        
        for (int idx=0; idx<code.length(); idx++) {
            
            String str = code.substring(idx, idx+1);
            
            switch(mode) {
                case 1:
                    if (str.equals("1")) {
                        mode = 0;
                        break;
                    }
                    
                    if (idx%2==1) {
                        ret += str;
                    }
                    
                    break;
                    
                case 0:
                    if (str.equals("1")) {
                        mode = 1;
                        break;
                    }
                    
                    if (idx%2==0) {
                        ret += str;
                    }
                    
                    break;
            }
        }
        
        if (ret.equals("")) {
            ret = "EMPTY";
        }
        
        return ret;
    }
}