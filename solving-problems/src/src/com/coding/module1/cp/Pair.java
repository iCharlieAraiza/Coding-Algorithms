package com.coding.module1.cp;

import java.util.List;
import java.util.stream.Collectors;

public class Pair {

    private List<Integer> numberList;

    public void setList( List<Integer> numberList){
        this.numberList = numberList;
    }

    public List<Integer> getNumbers(){

        return numberList
                .stream()
                .filter(num -> num%2==0)
                .collect(Collectors.toList());

    }
}
