public class BinarySearch {
    /*
        It's important to use Math.floor() to get the mid value pointer
    */
    public static void main(String args[]) {
        //Time complexity O(log n)
        //Test List= [-2, 0, 1, 4, 8, 10, 11, 20]   Targer= [10] Result = 5
        int[] list = new int[]{2, 5, 6, 9, 13, 15, 28, 30, 33, 34, 35};
        int target = 9;
        
        System.out.println( getIndex(list, target) );
    }
    
    public int search(int[] numbers, int target){
        int start = 0,
            end = numbers.length - 1;
        
        while(start<=end){
            int middle = ( start + end ) / 2;
            if(numbers[middle] == target) return middle;
            if(numbers[middle]>target) end = middle - 1;
            else start = middle + 1;
        }
        return -1;
    }
}
