public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		//Given an array of positive numbers and a positive number ‘k,’ find the maximum sum of any contiguous subarray of size ‘k’.
        int numbers[] = {10, 2, -3, 33, 4, -3};
        int numbersb[] = {2, 1, 5, 2, 3, 2, 5};
        var num = max(numbers, 5);
        var minNum = minWindow(numbersb, 55);
        
        System.out.println(num);
        System.out.println(minNum);
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
