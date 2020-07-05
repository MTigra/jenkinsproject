package org.example.simplejenkinsdocker;
import org.junit.Test;

public class ExampleTests {

    @Test(expected = NullPointerException.class)
    public void whenExceptionThrown_thenExpectationSatisfied() {
        String test = null;
        test.length();
    }
}
