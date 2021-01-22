package test;

import com.company.stones.Garnet;
import com.company.stones.Ruby;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RubyTest {
    @Test
    void prize() throws Exception{
        Ruby ruby =new Ruby();
        double actual= ruby.SetW(0.9);
        double expected = 10224;
        assertEquals(expected,actual);
    }
}