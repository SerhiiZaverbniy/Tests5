package test;

import com.company.stones.Emerald;
import com.company.stones.Garnet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GarnetTest {
    @Test
    void prize() throws Exception{
        Garnet garnet =new Garnet();
        double actual= garnet.SetW(0.15);
        double expected = 27.75;
        assertEquals(expected,actual);
    }
}