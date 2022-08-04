import java.util.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		//Given an array of positive numbers and a positive number ‘k,’ find the maximum sum of any contiguous subarray of size ‘k’.
        int numbers[] = {10, 2, -3, 33, 4, -3};
        int numbersb[] = {2, 1, 5, 2, 3, 2, 5};
        
        int arrA[] = {2,3,4,5,6,7,6};
        int arrB[] = {3,2,4,5,6,6,6};
        
        var num = max(numbers, 5);
        var minNum = minWindow(numbersb, 55);
        var result = isAPermutation(arrA, arrB);
        
        System.out.println(num);
        System.out.println(minNum);
        
        System.out.println("Result is " + result);
	}
	
	static int max(int[] numbers, int k) {
	    int left = 0;
	    int right = 0;
	    int max = numbers[0];
	    int sum = 0;
	    
	    for (right = 0; right <  numbers.length; right++) {
	        sum += numbers[right];
	        if (right >= k) {
	            sum = sum - numbers[left++];
	        }
	        max = max < sum ? sum : max;
	    }
	    
	    return max;
	}
	
	
	
	/*
	
	    O(n^2)
	    
	    (arr.length != arrB.length) return false
	    
	    [2,3,4,5,6,7,6]
	    [3,2,4,5,6,6,7]
	    
	    [2:1, 3:1, ]
	    [2:1, 3:1, ]
	    
	   
	    [2,3,4,5,6,7,6]
	    map [num] !== mapB[num] return false 

	    return true
	    
	*/
	
	static boolean isAPermutation(int[] arrA, int[] arrB) {
	    if(arrA.length != arrB.length) {
	        return false;
	    }
	    
	    /*
	        [2,3,4,5,6,7,7]
	        [3,2,4,5,6,6,7]
	    
	        [2:1, 3:1, 4:1, 5:1, 6:2, 7:1]
	        [3:1, 2:1, 4:1. 5:1, 6:2, 7:1]
	        
	        
	    */
	    
	    Map<Integer, Integer> mapA = new HashMap<>();
	    Map<Integer, Integer> mapB = new HashMap<>();

	    for (int i = 0; i < arrA.length; i++) {
	        int countA = mapA.get(arrA[i]) != null ? mapA.get(arrA[i]) + 1: 0;
	        int countB = mapB.get(arrB[i]) != null ? mapB.get(arrB[i]) + 1: 0;
	        mapA.put(arrA[i], countA);
	        mapB.put(arrB[i], countB);
	    }
	    
	    for (int num : arrA) {
	        if (mapA.get(num) != mapB.get(num)) {
	            return false;
	        }
	    }
	    return true;
	}
	
	static int min(int[] arr, int k) {
	    int length = arr.length;
	    int left = 0;
	    int right = 0;
	    int count = 0;
	    int sum = 0;
	    
	    /* 
	        [2, 1, 5, 2, 3, 2, 5]
	    */
	    
	    for (left = 0; left < arr.length; left++) {
            for(right = left; right < arr.length; right++) {
                sum += arr[right];
                count++;
                if(sum >= k) {
                    length =  length < count ? length : count;
                    count = 0;
                    sum = 0;
                    break;
                }
            }
	    }
        
	    return length;
	}
	
	
	//Time complexity is O(n)
	
	static int minWindow(int[] arr, int k) {
	    /* 
	        [(2), 1, 5, 2, 3, 2, 5]  k = 7   l = 1
	        [(2, 1), 5, 2, 3, 2, 5]  k = 7   l = 2
	        [(2, 1, 5), 2, 3, 2, 5]  k = 7   l = 3
	        [2, (1, 5), 2, 3, 2, 5]  k = 7   l = 2
	        [2, (1, 5, 2,) 3, 2, 5]  k = 7   l = 3
	        [2, 1, (5, 2,) 3, 2, 5]  k = 7   l = 2
	        [2, 1, 5, (2,) 3, 2, 5]  k = 7   l = 1

	    */
	    
	    int sum = 0;
	    int length = Integer.MAX_VALUE;
	    int left  = 0;
	    int count = 0;

	    for (int right = 0; right < arr.length; right++) {
	        sum += arr[right];
	        count++;
	        while(sum >= k) {
	            length = length  < count ? length : count;
	            count--;
	            sum = sum - arr[left++];
	        }
	    }
	    return length;
	}
	
}
