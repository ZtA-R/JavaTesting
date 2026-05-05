package JavaTesting;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTest {

    @Test
    public void sumTest(){
        int r = 1 + 1;
        assertEquals(2, r , "1 + 1 = 2");

    }
}
