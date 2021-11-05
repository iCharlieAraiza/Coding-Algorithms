import java.util.Arrays;

public class ArraysFunction {
    public static void main(String args[]) {
        //Question: What is the difference between an array and arraylist?
        
        //Declare an array without values
        int[] a = new int[10];
        a[1] = 12;
        
        System.out.println( a[1] );
        
        //Declare an array using values 
        int[]b = new int[]{-1, 2, 3, 4, 5};
        
        System.out.println( b[2] );
        
        //Declare a 2D array
        int[][]c = new int[2][2];
        
        for(int i = 0; i < 2; i++){
            for(int j = 0; j<2; j++){
                c[i][j] = i + j; 
            }
        }
        
        System.out.println( Arrays.deepToString( c ) );
    
        
        /*======================
            Common methods
        =========================*/
        
        //1. Print an array in Java
        int[] intArray = { 1, 2, 3, 4, 5 };
        String intArrayString = Arrays.toString(intArray);
         
        System.out.println(intArrayString);
        // [1, 2, 3, 4, 5]
        
        //2d array
        int[][]numbers = new int[2][2];
        numbers[0][0] = 109;
        numbers[0][1] = 121;
        numbers[1][0] = 39;
        numbers[1][1] = 87;
        System.out.println(Arrays.deepToString(numbers));
    }  
}
