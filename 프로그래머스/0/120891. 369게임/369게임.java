class Solution {
    public int solution(int order) {
        String order_str = "" + order;
        
        order_str = order_str.replaceAll("[^369]", "");
        
        return order_str.length();
    }
}