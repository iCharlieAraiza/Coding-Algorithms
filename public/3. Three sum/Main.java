import java.util.*;

class Program {
/*
array = [12, 3, 1, 2, -6, 5, -8, 6]
targetSum = 0
[[-8, 2, 6],[-8, 4, 5],[-6, 1, 5]]


Approach = two pointers

[12, 3, 1, 2, -6, 5, -8, 6]

[-8, -6, 1, 2, 3, 5, 6, 12]
      c  
         i               j    

targetSum = 0;
i = 2
j = 7
sum = -6 + i(3) + j(5) = 0


i < j
[(-8, 2, 6), (-8, 3, 5) ]

*/
  public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
    Arrays.sort(array);
    List<Integer[]> triplets = new ArrayList<Integer[]>();
    //[-8, -6, 1, 2, 3, 5, 6, 12]
    for(int i = 0; i < array.length - 2; i++){
      int j = i + 1;
      int k = array.length - 1;
      while(j < k){
        System.out.println("i:" + i + " j:" + j + " k:" + k);
        int sum = array[i] + array[j] + array[k];
        if(sum == targetSum) {
          triplets.add(new Integer[]{array[i], array[j], array[k]});
          j++;
          k--;
        } 
        if(sum > targetSum){
          k--;
        } else if(sum < targetSum){
          j++;          
        }
      }
    }
  
    return triplets;
  }
}
