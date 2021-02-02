package com.strings;


/*
*   TODO:
*       [✅] Step 1: Understand and verify the constraints. Ask questions to the interviewer.
*                   - It has two inputs
*       -
*      [✅] Step 2: Define the test cases
*                   - S: "ab#z"      T:"az#z"     true
*                   - S: "abC#z"     T:"acc"      false
*                   - S: "x#y#z#"    T:"a#"       false
*
* */


import javax.lang.model.type.ArrayType;
import java.util.Arrays;

public class TypedOut {

    public static void main(String[] args){
        System.out.println("Response "+ transformString("ho##l#a"));
    }


    public static boolean firstSolution(String a, String b){
        boolean response;

        return false;
    }

     private static String transformString(String a){
        int length = a.length();
        char[] newString = new char[length];
        char[] referenceString = a.toCharArray();
        Arrays.fill(newString, ' ');

        int pointer = 0;
        for(int i = 0; i<length; i++){


            System.out.println(referenceString[i]);

            if(referenceString[i]!='#'){
                newString[pointer++] = referenceString[i];
            }else{
                if(pointer>0){
                    newString[--pointer] = ' ';
                    //pointer--;
                }
            }

            System.out.println(newString[i]);
        }

        return new String(newString);
    }

}
