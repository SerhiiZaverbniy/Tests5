package test;

import com.company.stones.Amber;
import com.company.stones.Sapphire;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SapphireTest {
    @Test
    void prize() throws Exception{
        Sapphire sapphire =new Sapphire();
        double actual= sapphire.SetW(0.02);
        double expected = 1900;
        assertEquals(expected,actual);
    }
}