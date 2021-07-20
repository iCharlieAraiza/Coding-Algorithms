package org.main;

import java.util.HashMap;

public class Array {

    // {1,2,3,4,5,6,7} 7
    // [2, 3]
    public int[] getSumOfIndex(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    int[] getSumOfIndexOptimal(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int aux = target - num;
            if(map.containsKey(aux)){
                return new int[]{i, map.get(aux) };
            }else {
                map.put(num, i);
            }
        }
        return null;
    }
}
