package test;

import com.company.stones.Amber;
import com.company.stones.Amethyst;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AmethystTest {
    @Test
    void prize() throws Exception{
        Amethyst amethyst =new Amethyst();
        double actual= amethyst.SetW(13);
        double expected = 1885;
        assertEquals(expected,actual);
    }
}