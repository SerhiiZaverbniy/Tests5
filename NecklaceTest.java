package test;

import com.company.stones.Necklace;
import com.company.stones.Stone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NecklaceTest {

    @Test
    void sumPrize() {
        Necklace necklace=new Necklace();

        necklace.Add("aventure",10);
        necklace.Add("spinel",4);
        necklace.Add("aquamarine",0.5);
        necklace.SumPrize();
        double actual= necklace.SumP();
        double expected = 1415;
        assertEquals(expected,actual);
    }
}