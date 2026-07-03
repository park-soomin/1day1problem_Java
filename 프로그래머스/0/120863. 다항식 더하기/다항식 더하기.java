class Solution {
    public String solution(String polynomial) {
        
        int coef = 0; int cns = 0;
        
        String[] poly = polynomial.split(" \\+ ");
        
        for (int i=0; i<poly.length; i++) {
            if (poly[i].equals("x")) {
                coef += 1;
            } else if (poly[i].contains("x")) {
                coef += Integer.parseInt(poly[i].replace("x", ""));
            } else {
                cns += Integer.parseInt(poly[i]);
            }
        }
        
        String result = "";
        if (coef == 0) {
            result += cns;
        } else if (coef == 1) {
            if (cns == 0) result = "x";
            else result = result + "x + " + cns;
        } else {
            if (cns == 0) result = result + coef + "x";
            else result = result + coef + "x + " + cns;
        }
            
        return result;
    }
}