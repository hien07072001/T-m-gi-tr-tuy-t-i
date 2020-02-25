import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {
//Viết test(b1)
    @Test
    void testFindAbsolute() {
        int number=0;
        int expected=0;
        int result=AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }
//    Viết mã để pass test case(b2)
//   Refactor mã nguồn(b3)


}