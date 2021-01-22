package test;

import com.company.stones.Aquamarine;
import com.company.stones.Aventure;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AventureTest {
    @Test
    void prize() throws Exception{
        Aventure aventure =new Aventure();
        double actual= aventure.SetW(20);
        double expected = 10;
        assertEquals(expected,actual);
    }
}