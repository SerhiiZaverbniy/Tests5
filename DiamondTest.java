package test;

import com.company.stones.Aventure;
import com.company.stones.Diamond;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiamondTest {
    @Test
    void prize() throws Exception{
        Diamond diamond =new Diamond();
        double actual= diamond.SetW(0.01);
        double expected = 990;
        assertEquals(expected,actual);
    }

}