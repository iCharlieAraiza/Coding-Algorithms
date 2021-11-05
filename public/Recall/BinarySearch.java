public class BinarySearch {
    /*
        It's important to use Math.floor() to get the mid value pointer
    */
    public static void main(String args[]) {
        //Time complexity O(log n)
        //Test List= [-2, 0, 1, 4, 8, 10, 11, 20]   Targer= [10] Result = 5
        int[] list = new int[]{2, 5, 6, 9, 13, 15, 28, 30};
        int target = 30;
        
        System.out.println( getIndex(list, target) );
    }
    
    public static int getIndex(int[] list, int target){
        int p = 0,
            q = list.length,
            midPoint = (int)Math.floor((p + q) / 2);

        while(p <= q && list[midPoint]!=target){
            midPoint = (int)Math.floor((p + q) / 2);
            if(list[midPoint] == target){
                return midPoint;
            }else{
                if( list[midPoint] < target ){
                    p = midPoint+1;
                }else{
                    q = midPoint-1;
                }
            }
        }
        return -1;
    }
}
