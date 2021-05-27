package com.coding.module1.cp;

public class Reverse {
    public void reverseString(char[] s) {
        char aux = ' ';
        int medium = (int) Math.floor( s.length / 2 ), p = s.length -1;

        for(int i=0; i< medium; i++){
            aux = s[i];
            s[i] = s[p];
            s[p] = aux;
            p--;
        }

        for(char c : s){
            System.out.println(c);
        }

    }
}

