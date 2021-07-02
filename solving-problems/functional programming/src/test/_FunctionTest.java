package test;


import org.course._Function;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

class _FunctionTest {
    private _Function test;
    @BeforeEach
    void beforeEach(){
        test = new _Function();
    }

    @Test
    void addOne(){
        assertEquals( 2, test.incrementByOne.apply(1) );
    }

    @Test
    void multiplyByTen(){
        assertEquals( 20, test.multiplyByTen.apply(2) );
    }

    @Test
    void addOneAndThenMultiplyByTen(){
        Function<Integer, Integer> addOneAndThenMultiplyByTen = test.incrementByOne.andThen( test.multiplyByTen );
        assertEquals(20, addOneAndThenMultiplyByTen.apply(1) );
    }

    @Test
    void addOneAndMultiplyBy(){
        assertEquals(15, test.addOneAndMultiplyBy.apply(4, 3) );
    }
}