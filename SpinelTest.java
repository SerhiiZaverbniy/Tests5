package test;

import com.company.stones.Sapphire;
import com.company.stones.Spinel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpinelTest {
    @Test
    void prize() throws Exception{
        Spinel spinel =new Spinel();
        double actual= spinel.SetW(10);
        double expected = 50;
        assertEquals(expected,actual);
    }
}