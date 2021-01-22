package test;

import com.company.stones.Amethyst;
import com.company.stones.Aquamarine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AquamarineTest {
    @Test
    void prize() throws Exception{
        Aquamarine aquamarine =new Aquamarine();
        double actual= aquamarine.SetW(0.1);
        double expected = 278;
        assertEquals(expected,actual);
    }
}