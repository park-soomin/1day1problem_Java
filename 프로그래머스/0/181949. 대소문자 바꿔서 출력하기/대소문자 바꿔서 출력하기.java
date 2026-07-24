import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        
        for (int i=0; i<a.length(); i++) {
            
            char c = a.charAt(i);
            
            if (c>=65 && c<=90) {
                result += String.valueOf(c).toLowerCase();
            } else {
                result += String.valueOf(c).toUpperCase();
            }
        }
        
        System.out.print(result);
    }
}