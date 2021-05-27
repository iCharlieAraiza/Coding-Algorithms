package com.coding.module1.cp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {
    Reverse reverse;

    @BeforeEach
    void beforEach(){
        reverse = new Reverse();
    }

    @Test
    void reverseHello(){
        reverse.reverseString( new char[]{'h','e','l','l','o', '!'} );
    }
}