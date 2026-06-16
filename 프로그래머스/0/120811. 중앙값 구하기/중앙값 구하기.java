class Solution {
    public int partition(int[] array, int left, int right) {
        int pivot = array[left];
        int i = left;
        int j = right + 1;
        int temp;
        
        do {
            do {i++;} while (i < right && pivot >= array[i]);
            do {j--;} while (j > left && pivot <= array[j]);
            if (i < j) {
                temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        } while (i < j);
        
        temp = array[left];
        array[left] = array[j];
        array[j] = temp;
        
        return j;
    }
    
    public void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pivot = partition(array, left, right);
            
            quickSort(array, left, pivot-1);
            quickSort(array, pivot+1, right);
        }
    }
    
    public int solution(int[] array) {
        quickSort(array, 0, array.length-1);
        
        return array[array.length/2];
    }
}