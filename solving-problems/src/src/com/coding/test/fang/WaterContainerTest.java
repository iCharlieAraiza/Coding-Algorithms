package com.coding.test.fang;

import com.coding.module1.fanginterview.WaterContainer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaterContainerTest {

    @Test
    void firstAproachTest(){
        WaterContainer container = new WaterContainer(new int[]{1, 8, 6, 2, 9, 4});
        assertEquals(24, container.calculateFirst());
    }

    @Test
    void secondAproachTest(){
        WaterContainer container = new WaterContainer(new int[]{4,3,2,1,4});
        assertEquals(16, container.calculateFirst());
    }

    @Test
    void thirdAproachTest(){
        WaterContainer container = new WaterContainer(new int[]{1,2,1});
        assertEquals(2, container.calculateFirst());
    }

    @Test
    void fourthAproachTest(){
        WaterContainer container = new WaterContainer(new int[]{1,8,6,2,5,4,8,3,7});
        assertEquals(49, container.calculateFirst());
    }

}