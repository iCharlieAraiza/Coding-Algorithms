package test;

import org.course._Consumer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _ConsumerTest {
    private _Consumer test;

    @BeforeEach
    void beforeEach(){
        test = new _Consumer();
    }

    @Test
    void showGreeting(){
        test.greeting.accept( "Carlos") ;
    }
}