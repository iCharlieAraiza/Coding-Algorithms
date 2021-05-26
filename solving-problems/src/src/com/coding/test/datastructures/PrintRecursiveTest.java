package com.coding.test.datastructures;

import com.coding.module1.datastructures.PrintRecursive;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintRecursiveTest {
    PrintRecursive recursive;
    String[] names;

    @BeforeEach
    void beforeEach(){
        recursive = new PrintRecursive();

        names = new String[]{
                "Juan",
                "Pedro",
                "María",
                "Carlos"
        };
    }

    @Test
    void testFirstRecurtion(){
        assertEquals(0, recursive.all(10) );
    }

    @Test
    void sumPositiveNumbers(){
        //10 + 10 + 10 + 10 + 10 + 5 = 55
        assertEquals(55, recursive.sumPositives(10) );

    }

    @Test
    void factorial(){
        assertEquals(3628800, recursive.factorial(10) );
    }

    @Test
    void getFirstOddIndex(){
        int[] numbers = new int[]{1,4,5,5,4,8,90};
        assertEquals( 3 , recursive.getOddIndex(numbers.length-1, numbers) );
    }

    @Test
    void printAllElementsInverse(){

        recursive.printAllElementsInverse( names.length-1 , names );
    }

    @Test
    void printAllElements(){
        recursive.printAllElements(0, names) ;
    }
}