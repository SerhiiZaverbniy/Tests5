package test;

import com.company.stones.Amber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AmberTest {
    @Test
    void prize() throws Exception{
        Amber amber =new Amber();
        double actual= amber.SetW(6);
        double expected = 21;
        assertEquals(expected,actual);
    }
}