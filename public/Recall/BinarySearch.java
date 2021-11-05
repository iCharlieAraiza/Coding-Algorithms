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
    
    public static int getIndex(int[] num, int target) {
    int start = 0;
    int end = nums.length-1;

        while(start <= end){
            int mid = start +(end -start )/2;
            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] < target){
                start = mid +1;
            }else{
                end = mid - 1;
            }
        } return -1;
    }
}
