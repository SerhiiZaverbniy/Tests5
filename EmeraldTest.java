package test;

import com.company.stones.Diamond;
import com.company.stones.Emerald;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmeraldTest {
    @Test
    void prize() throws Exception{
        Emerald emerald =new Emerald();
        double actual= emerald.SetW(0.25);
        double expected = 6390;
        assertEquals(expected,actual);
    }
}