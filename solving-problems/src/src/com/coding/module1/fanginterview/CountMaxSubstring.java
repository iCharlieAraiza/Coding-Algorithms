package com.coding.module1.fanginterview;

import java.util.HashMap;

public class CountMaxSubstring {
    public int getMax(String string){
        if(string.length()<=1)
            return string.length();

        int max = 0,
            length = string.length(),
            left = 0;
        HashMap<Character, Integer> seenChar = new HashMap<>();

        for(int right = 0; right < length; right++){
            char current = string.charAt(right);

            if( seenChar.get(current) != null){
                if(seenChar.get(current)>=left){
                    left = seenChar.get(current) + 1;
                }
            }

            seenChar.put(current, right);
            max = Math.max(max, right - left + 1);

        }

        return max;
    }
}
