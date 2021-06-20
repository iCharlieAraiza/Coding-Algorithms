package com.coding.test;

import com.coding.module1.cp.Pair;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PairTest {
    private Pair pair;

    @BeforeEach
    void beforeEach(){
        pair = new Pair();
    }

    @Test
    void checkList(){
        List<Integer> pairList = new ArrayList<>();

        for (int i=0; i<100; i++){
            pairList.add(i);
        }

        pair.setList(pairList);

        List<Integer> newPairList = pair.getNumbers();

        newPairList.forEach(System.out::println);
    }

}