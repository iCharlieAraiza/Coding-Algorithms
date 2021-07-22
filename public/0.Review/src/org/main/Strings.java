package org.main;

public class Strings {
    public String reverseString(String word){
        StringBuilder aux = new StringBuilder();
        for(int i = word.length()-1; i>= 0; i--){
            aux.append(word.charAt(i));
        }
        return aux.toString();
    }
}
