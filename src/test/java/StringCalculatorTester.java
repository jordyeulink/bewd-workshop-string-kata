import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;


public class StringCalculatorTester {

    private StringCalculator sut;
    @BeforeEach
    public void setup(){
        sut = new StringCalculator();
    }

    @Test
    void executeWithValidIntTest(){
        var testValue = sut.add("5");
        Assertions.assertEquals(5, testValue);
    }

    @Test
    void executeWithMultipleValidIntTest(){
        var testValue = sut.add("5,1,4,5");
        Assertions.assertEquals(15, testValue);
    }
    @Test
    void executeWithNegativeValidIntTest(){
        var testValue = sut.add("-1");
        Assertions.assertEquals(-1, testValue);
    }
    @Test
    void executeWithUnvalidStringTest(){
        var testValue = sut.add("");
        Assertions.assertEquals(0, testValue);
    }
}
