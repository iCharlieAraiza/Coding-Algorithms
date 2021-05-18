package com.coding.module1.datastructures;

import java.util.HashMap;

/**
 *  Count each characters
 */




public class CountChar {

    public HashMap<Character,Integer> count(String word){

        HashMap<Character, Integer> result = new HashMap<>();
        int length = word.length();

        for(int i = 0; i<length; i++){
            char letter = word.charAt(i);
            if(result.containsKey(letter)){
                int val = result.get(letter);
                result.put(letter, ++val);
            }else{
                result.put(letter, 1);
            }
        }
        return result;
    }
}
