package test;

import com.company.stones.Necklace;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NecklaceTest2 {

    @Test
    void sumWeight() {
        Necklace necklace=new Necklace();

        necklace.Add("aventure",10);
        necklace.Add("spinel",4);
        necklace.Add("aquamarine",0.5);
        necklace.SumWeight();
        double actual= necklace.SumW();
        double expected = 14.5;;
        assertEquals(expected,actual);
    }
}