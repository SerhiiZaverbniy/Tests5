package test;

import com.company.stones.Stone;

import static org.junit.jupiter.api.Assertions.*;

class StoneTest {

    @org.junit.jupiter.api.Test
    void prize() throws Exception{
        Stone stone=new Stone();
        double actual= stone.Prize(12,2);
        double expected = 24;
        assertEquals(expected,actual);
    }
}