package org.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

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

    public int[] getSumOfIndexOptimal(int[] nums, int target){
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

    public Character firstRepeatedChar(ArrayList<Character> list){
        ArrayList<Character> chars = new ArrayList<>();
        for(char aux : list){
            if(chars.contains(aux)){
                return aux;
            }else {
                chars.add(aux);
            }
        }

        return null;
    }

    public Character firstRepeatedCharSingle(ArrayList<Character> list){
        //Recorrer el arreglo
        //Recottrt arreglo inicializado j = i + 1
            //Si val[i] === val [j], regresar el valor

        for(int i = 0; i < list.size(); i++){
            for (int j = i+1; j < list.size(); j++){
               if( list.get(i).equals( list.get(j)) ){
                   return list.get(i);
               }
            }
        }

        return null;
    }


    public List<Integer> mergeTwoSortedList(List<Integer> a, List<Integer> b){
        List<Integer> result = new ArrayList<>();

        a.forEach(el ->{
            result.add(el);
        });

        b.forEach(el->{
            result.add(el);
        });

        Collections.sort(result);
        return result;
    }
}
